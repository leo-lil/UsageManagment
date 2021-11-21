package com.ai.openbilling.cdr.domain;

import java.io.Serializable;

public class BaseResponse  implements Serializable{
	private Integer rspCode;
	private String rspDesc;
	public BaseResponse(){
		this.rspCode=0;
	}
	
	public Integer getRspCode() {
		return rspCode;
	}

	public void setRspCode(Integer rspCode) {
		this.rspCode = rspCode;
	}

	public String getRspDesc() {
		return rspDesc;
	}
	public void setRspDesc(String rspDesc) {
		this.rspDesc = rspDesc;
	}
	
}
