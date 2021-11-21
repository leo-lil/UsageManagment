package com.ai.openbilling.cdr.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ai.openbilling.cdr.config.PropertiesConfig;
import com.ai.openbilling.cdr.domain.CdrReqBo;
import com.ai.openbilling.cdr.domain.CdrRespBo;
import com.ai.openbilling.cdr.domain.CdrRespItemBo;
import com.ai.openbilling.cdr.domain.Money;
import com.ai.openbilling.cdr.domain.RatedProductUsage;
import com.ai.openbilling.cdr.domain.RelatedParty;
import com.ai.openbilling.cdr.domain.Usage;
import com.ai.openbilling.cdr.domain.UsageCharacteristic;
import com.ai.openbilling.cdr.domain.UsageResponse;
import com.ai.openbilling.cdr.domain.UsageSpecificationRef;
import com.ai.openbilling.cdr.domain.UsageStatusType;
import com.ai.openbilling.cdr.handler.BusinessException;
import com.ai.openbilling.cdr.handler.ResetfulHandler;
import com.ai.openbilling.cdr.service.UsageManagmentService;

import cn.hutool.json.JSONUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@Api(tags = "UsageManagmentController", description = "Usage Managment")
@RequestMapping("/usageManagment")
public class UsageManagmentController {
	@Autowired
	private UsageManagmentService usageManagmentService;
	
	@Autowired
	private ResetfulHandler resetfulHandler;
	
	
	@Autowired
	PropertiesConfig propertiesConfig;
	
	@ApiOperation(value="Query usage")
	@RequestMapping(value = "/listUsage",method= {RequestMethod.GET})
	public UsageResponse listUsage(@RequestParam(value = "fields", required = false) String fields){
		Map<String, String> headers = new HashMap<String, String>();
		if(StringUtils.isEmpty(fields)) {
			throw new BusinessException("bad request parameter",500);
		}
		CdrReqBo reqBo=new CdrReqBo();
		String [] paras=fields.split("\\|");
		if(paras==null ||paras.length!=5) {
			throw new BusinessException("bad request parameter",500);
		}
		reqBo.setPhoneNumber(paras[0]);
		reqBo.setAcctId(Long.parseLong(paras[1]));
		reqBo.setStartDate(getDate(paras[2],"yyyy-MM-dd HH:mm:ss"));
		reqBo.setEndDate(getDate(paras[3],"yyyy-MM-dd HH:mm:ss"));
		List<String> serverList=new ArrayList<>();
		String[] serviceArray=paras[4].split(",");
		for(String service:serviceArray) {
			serverList.add(service);
		}
		reqBo.setServerList(serverList);
		String jsonStr=JSONUtil.toJsonStr(reqBo);
		ResponseEntity<String> response=resetfulHandler.callReseful(propertiesConfig.getCdrUrl(),
				HttpMethod.POST, 
				null, 
				headers,
				jsonStr,
				null);
		CdrRespBo cdrRespBo=null;
		if(response!=null){
			cdrRespBo=JSONUtil.toBean(response.getBody(), CdrRespBo.class);
		}
		if(cdrRespBo==null) {
			throw new BusinessException("call cdr service error",500);
		}
		List<Usage> dataList=new ArrayList<Usage>();
		List<CdrRespItemBo> itemList=cdrRespBo.getItemList();
		if(itemList!=null) {
			for(CdrRespItemBo bo:itemList) {
				Usage usage=buildUsageByCdrRespItemBo(bo);
				dataList.add(usage);
			}
		}
		UsageResponse resp=new UsageResponse();
		resp.setDataList(dataList);
		resp.setRspCode(0);
		resp.setRspDesc("success");
		return resp;
	}

	private Usage buildUsageByCdrRespItemBo(CdrRespItemBo bo) {
		
		String date=bo.getDate();
		String time=bo.getTime();
		String formatDate=date+" "+time;
		Usage usage=new Usage();
		usage.description("Domestic Data");
		String uuid1=UUID.randomUUID().toString();
		usage.setHref("https://api.verislitedemo.com/api/usagemanagement/v4/usage/"+uuid1);
		usage.setId(uuid1);
		
		List<RatedProductUsage> ratedProductUsages=new ArrayList<RatedProductUsage> ();
		RatedProductUsage ratedProductUsage=new RatedProductUsage();
		Money bucketValueConvertedInAmount=new Money ();
		bucketValueConvertedInAmount.setUnit("MB");
		float value=0;
		if(StringUtils.isNotEmpty(bo.getUnit())) {
			value=Float.parseFloat(bo.getUnit())/1024*1024;
		}
		bucketValueConvertedInAmount.setValue(value);
		ratedProductUsage.setBucketValueConvertedInAmount(bucketValueConvertedInAmount);
		ratedProductUsage.setIsBilled(true);
		ratedProductUsage.setIsTaxExempt(false);
		ratedProductUsage.setOfferTariffType("Normal");
		ratedProductUsage.setRatingAmountType("Total");
		ratedProductUsage.setRatingDate(getDate(formatDate,"yyyy-MM-dd HH:mm:ss"));
		float paid=0;
		if(StringUtils.isNotEmpty(bo.getPaid())) {
			paid=Float.parseFloat(bo.getPaid());
		}
		float tax=0;
		if(StringUtils.isNotEmpty(bo.getTax())) {
			tax=Float.parseFloat(bo.getTax());
		}
		Money taxExcludedRatingAmount=new Money ();
		taxExcludedRatingAmount.setUnit("USD");
		taxExcludedRatingAmount.setValue(paid-tax);
		ratedProductUsage.setTaxExcludedRatingAmount(taxExcludedRatingAmount);
		
		Money taxIncludedRatingAmount =new Money ();
		taxIncludedRatingAmount.setUnit("USD");
		taxExcludedRatingAmount.setValue(paid);
		ratedProductUsage.setTaxIncludedRatingAmount(taxIncludedRatingAmount);
		ratedProductUsage.setTaxRate(0f);
		ratedProductUsage.setUsageRatingTag(bo.getCallCategory());
		ratedProductUsages.add(ratedProductUsage);
		usage.setRatedProductUsage(ratedProductUsages);
		
		List<RelatedParty> relatedPartys=new ArrayList<>();
		RelatedParty relatedParty=new RelatedParty();
		String uNumber=bo.getuNumber();
		relatedParty.setHref("https://api.verislitedemo.com/api/partyManagement/v4/individual/"+uNumber);
		relatedParty.setId(uNumber);
		relatedParty.setName(uNumber);
		relatedParty.setReferredType("Individual");
		relatedParty.setRole("Customer");
		relatedPartys.add(relatedParty);
		usage.setRelatedParty(relatedPartys);
		
		usage.setStatus(UsageStatusType.RATED);
		
		List<UsageCharacteristic> usageCharacteristics=new ArrayList<>();
		UsageCharacteristic usageCharacteristicBnumber=new UsageCharacteristic();
		usageCharacteristicBnumber.setId(UUID.randomUUID().toString());
		usageCharacteristicBnumber.setName("bNumber");
		usageCharacteristicBnumber.setValue(bo.getBNumber());
		usageCharacteristicBnumber.setValueType("string");
		usageCharacteristics.add(usageCharacteristicBnumber);
		UsageCharacteristic usageCharacteristicLocation=new UsageCharacteristic();
		usageCharacteristicLocation.setId(UUID.randomUUID().toString());
		usageCharacteristicLocation.setName("Location");
		usageCharacteristicLocation.setValue(bo.getRoamCountryId());
		usageCharacteristicLocation.setValueType("string");
		usageCharacteristics.add(usageCharacteristicLocation);
		usage.setUsageCharacteristic(usageCharacteristics);
		
		usage.setUsageDate(getDate(formatDate,"yyyy-MM-dd HH:mm:ss"));
		
		UsageSpecificationRef usageSpecification=new UsageSpecificationRef ();
		String uuid2=UUID.randomUUID().toString();
		usageSpecification.setHref("https://api.verislitedemo.com/api/usageManagement/v4/usageSpecification/"+uuid2);
		usageSpecification.setId(uuid2);
		usageSpecification.setName("data");
		usage.setUsageSpecification(usageSpecification);
		
		usage.setUsageType("Data");
		return usage;
	}
	
    public static Date getDate(String sdate,String format){
        if(sdate==null){
            return null;
        }
        Date date = null;
        SimpleDateFormat formatter = new SimpleDateFormat(format);
        try {
            date = formatter.parse(sdate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}
