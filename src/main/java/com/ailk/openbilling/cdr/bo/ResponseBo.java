package com.ailk.openbilling.cdr.bo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * Created with IDEA
 * User: Elijah
 * Date: 2018/9/12 9:56
 * Describe:
 */
@ApiModel(value="ResponseBo",description="Common Response Fields")
public class ResponseBo {
    
    @ApiModelProperty(position=1,value="response code",required=true)
    String rspCode;
    @ApiModelProperty(position=2,value="response describe",required=true)
    String rspDesc;
    @ApiModelProperty(position=3,value="response timer",required=true)
    Date rspTime;
    @ApiModelProperty(position=4,value="request transaction ID",required=true)
    String transactionID;
    @ApiModelProperty(position=5,value="response transaction ID",required=true)
    String rspTransactionID;

    public String getRspCode() {
        return rspCode;
    }

    public void setRspCode(String rspCode) {
        this.rspCode = rspCode;
    }

    public String getRspDesc() {
        return rspDesc;
    }

    public void setRspDesc(String rspDesc) {
        this.rspDesc = rspDesc;
    }

    public Date getRspTime() {
        return rspTime;
    }

    public void setRspTime(Date rspTime) {
        this.rspTime = rspTime;
    }

    public String getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }

    public String getRspTransactionID() {
        return rspTransactionID;
    }

    public void setRspTransactionID(String rspTransactionID) {
        this.rspTransactionID = rspTransactionID;
    }
}
