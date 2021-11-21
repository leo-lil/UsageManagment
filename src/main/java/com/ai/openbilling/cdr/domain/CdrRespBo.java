package com.ai.openbilling.cdr.domain;

import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created with IDEA
 * User: Elijah
 * Date: 2019/5/28 15:27
 * Describe:
 */
@ApiModel(value="CdrRespBo",description="Query CDR Response")
public class CdrRespBo  extends  ResponseBo {
    
    @ApiModelProperty(position=1,value="item list",dataType="List<CdrRespItemBo>",required=true)
    List<CdrRespItemBo> itemList ;

    public List<CdrRespItemBo> getItemList() {
        return itemList;
    }

    public void setItemList(List<CdrRespItemBo> itemList) {
        this.itemList = itemList;
    }
}
