package com.ailk.openbilling.cdr.bo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.List;

/**
 * Created with IDEA
 * User: Elijah
 * Date: 2019/1/17 10:31
 * Describe:
 */
@ApiModel(value="CdrReqBo",description="Query CDR Request")
public class CdrReqBo {

    @ApiModelProperty(position=1,value="phone number",dataType="String",required=true)
    String phoneNumber;
    @ApiModelProperty(position=2,value="account ID",dataType="Long",required=true)
    Long acctId;
    @ApiModelProperty(position=3,value="start date",dataType="Date",required=true)
    Date startDate;
    @ApiModelProperty(position=4,value="end date",dataType="Date",required=true)
    Date endDate;
    @ApiModelProperty(position=5,value="service ID list",dataType="Date",required=true)
    List<String> serverList;

    public Long getAcctId() {
        return acctId;
    }

    public void setAcctId(Long acctId) {
        this.acctId = acctId;
    }

    public List<String> getServerList() {
        return serverList;
    }

    public void setServerList(List<String> serverList) {
        this.serverList = serverList;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
