package com.ailk.openbilling.cdr.bo;

import com.ailk.openbilling.ratingcdr.service.querycdr.QuerycdrService;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

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
