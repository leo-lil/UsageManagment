package com.ai.openbilling.cdr.handler;



public class BusinessException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	/** The error code. */
	private Integer errorCode;

	public Integer getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}
	public BusinessException(String message,Integer errorCode){
		super(message);
		this.errorCode = errorCode;
	}
}
