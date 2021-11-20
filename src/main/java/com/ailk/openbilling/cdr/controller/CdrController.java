package com.ailk.openbilling.cdr.controller;

import com.ailk.openbilling.cdr.bo.CdrReqBo;
import com.ailk.openbilling.cdr.bo.CdrRespBo;
import com.ailk.openbilling.cdr.bo.CdrRespItemBo;
import com.ailk.openbilling.cdr.common.config.PropertiesConfig;
import com.ailk.openbilling.cdr.util.DateUtil;
import com.ailk.openbilling.ratingcdr.persistence.querycond.entity.XdrQueryIn;
import com.ailk.openbilling.ratingcdr.persistence.querycond.entity.XdrQueryOut;
import com.ailk.openbilling.ratingcdr.service.querycdr.QuerycdrService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import javassist.bytecode.stackmap.BasicBlock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@Api("Query CDR Operator")
@RestController
@RequestMapping(value = "/CDR")
public class CdrController {
    @Autowired
    PropertiesConfig config;
    @Autowired
    QuerycdrService querycdr_querycdrService;
    private static final Logger LOG = LoggerFactory.getLogger(CdrController.class);

    @ApiOperation("Query CDR")
    @RequestMapping(method= {RequestMethod.POST})
    public CdrRespBo queryCdr(@RequestBody CdrReqBo reqBo){
        CdrRespBo response = new  CdrRespBo();
        XdrQueryIn in = new  XdrQueryIn();
        try {
            if(reqBo.getAcctId()!=null){
                in.setAccountId(reqBo.getAcctId().toString());
            }
            in.setStartTime(DateUtil.getFormatDate(reqBo.getStartDate(), DateUtil.DATE_FORMAT_DEFAULT_SHORT_8));
            in.setEndTime(DateUtil.getFormatDate(reqBo.getEndDate(), DateUtil.DATE_FORMAT_DEFAULT_SHORT_8));
            in.setPhone(reqBo.getPhoneNumber());
            //设置serviceId
            List<String> slist = reqBo.getServerList();
            if(slist!=null && slist.size()>0){
                StringBuffer stringBuffer = new StringBuffer();
                for(int i=0;i<slist.size();i++){
                    stringBuffer.append(slist.get(i));
                    if((i+1)<slist.size()){
                        stringBuffer.append(",");
                    }
                }
                in.setServiceId(stringBuffer.toString());
            }else{
                //VOICE |SMS  |  MMS  |  GPRS  | ISMP
                in.setServiceId("50001,50005,50014,53001,50006");
            }
        }catch  (Exception e){
            LOG.error(e.getLocalizedMessage());
            LOG.error(e.getMessage());
            response.setRspCode("1");
            response.setRspDesc("set query condtion have error!");
        }
        List<XdrQueryOut> list = null;
        try{
            list = querycdr_querycdrService.queryCdrForLite(in);
        }catch (Exception e){
            response.setRspCode("1");
            response.setRspDesc("query queryCdrForLite have error!");
            return response;
        }
        response.setItemList(new ArrayList <CdrRespItemBo>());
        if(list!=null && list.size()>0){
            for(XdrQueryOut out: list){
                CdrRespItemBo item = new CdrRespItemBo();
                item.setBNumber(out.getBNumber());
                item.setCallCategory(out.getCallCategory());
                item.setDate(out.getDate());
                item.setPaid(out.getPaid());
                item.setPaidOfMeasure(out.getPaidOfMeasure());
                item.setRoamCountryId(out.getRoamCountryId());
                item.setTax(out.getTax());
                item.setTaxOfMeasure(out.getTaxOfMeasure());
                item.setTime(out.getTime());
                item.setUnit(out.getUnit());
                item.setUnitOfMeasure(out.getUnitOfMeasure());
                response.getItemList().add(item);
            }
        }
        response.setRspCode("0");
        response.setRspDesc("success");
        return response;
    }

}
