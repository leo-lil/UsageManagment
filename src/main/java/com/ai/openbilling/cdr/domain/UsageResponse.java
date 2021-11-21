package com.ai.openbilling.cdr.domain;

import java.util.List;

import io.swagger.annotations.ApiModel;
import lombok.Data;

@Data
@ApiModel(value="UsageResponse",description="usage")
public class UsageResponse extends BaseResponse {
	List<Usage> dataList;
}
