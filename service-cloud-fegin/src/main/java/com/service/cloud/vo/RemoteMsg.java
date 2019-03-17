package com.service.cloud.vo;


public class RemoteMsg<T> {
	private Integer errCode;
	private String errDesc;
	private T data;

	public Integer getErrCode() {
		return errCode;
	}

	public void setErrCode(Integer errCode) {
		this.errCode = errCode;
	}

	public String getErrDesc() {
		return errDesc;
	}

	public void setErrDesc(String errDesc) {
		this.errDesc = errDesc;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "errCode=" + errCode + ", errDesc=" + errDesc + ", data=" + data;
	}
}
