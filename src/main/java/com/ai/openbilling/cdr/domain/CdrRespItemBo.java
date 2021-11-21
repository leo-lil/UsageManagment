package com.ai.openbilling.cdr.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created with IDEA
 * User: Elijah
 * Date: 2019/5/28 15:27
 * Describe:
 */
@ApiModel(value="CdrRespItemBo",description="CDR Item")
public class CdrRespItemBo {

    @ApiModelProperty(position=1,value="cdr time",dataType="String",required=true)
    String time;
    @ApiModelProperty(position=1,value="cdr day",dataType="String",required=true)
    String date;
    @ApiModelProperty(position=1,value="B number(destination number)",dataType="String",required=true)
    String bNumber;
    @ApiModelProperty(position=1,value="subjects",dataType="String",required=true)
    String callCategory;
    @ApiModelProperty(position=1,value="tax",dataType="String",required=true)
    String tax;
    //优惠后金额 
    @ApiModelProperty(position=1,value="Amount after discount",dataType="String",required=true)
    String paid;
    //累积量
    @ApiModelProperty(position=1,value="cumulant",dataType="String",required=true)
    String unit;
    @ApiModelProperty(position=1,value="cumulant measure ID",dataType="String",required=true)
    String unitOfMeasure;
    @ApiModelProperty(position=1,value="roaming country ID",dataType="String",required=true)
    String roamCountryId;
    @ApiModelProperty(position=1,value="tax amount measure ID",dataType="String",required=true)
    String taxOfMeasure;
    @ApiModelProperty(position=1,value="Amount after discount measure ID",dataType="String",required=true)
    String paidOfMeasure;
    
    @ApiModelProperty(position=1,value="U number(user number)",dataType="String",required=true)
    String uNumber;

    public String getuNumber() {
		return uNumber;
	}

	public void setuNumber(String uNumber) {
		this.uNumber = uNumber;
	}

	public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getBNumber() {
        return bNumber;
    }

    public void setBNumber(String bNumber) {
        this.bNumber = bNumber;
    }

    public String getCallCategory() {
        return callCategory;
    }

    public void setCallCategory(String callCategory) {
        this.callCategory = callCategory;
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    public String getPaid() {
        return paid;
    }

    public void setPaid(String paid) {
        this.paid = paid;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    public String getRoamCountryId() {
        return roamCountryId;
    }

    public void setRoamCountryId(String roamCountryId) {
        this.roamCountryId = roamCountryId;
    }

    public String getTaxOfMeasure() {
        return taxOfMeasure;
    }

    public void setTaxOfMeasure(String taxOfMeasure) {
        this.taxOfMeasure = taxOfMeasure;
    }

    public String getPaidOfMeasure() {
        return paidOfMeasure;
    }

    public void setPaidOfMeasure(String paidOfMeasure) {
        this.paidOfMeasure = paidOfMeasure;
    }
}
