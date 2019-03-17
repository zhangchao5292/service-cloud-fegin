package com.service.cloud.vo;

public class ResponseMsg {
	private Integer errorCode;
	private String errorMsg;
	private Object errorData;
	
	public Integer getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public boolean isOk() {
		return errorCode == 0;
	}

	public Object getErrorData() {
		return errorData;
	}

	public void setErrorData(Object errorData) {
		this.errorData = errorData;
	}

	@Override
	public String toString() {
		return "ResponseMsg [errorCode=" + errorCode + ", errorMsg=" + errorMsg + "]";
	}
}
