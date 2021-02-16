package com.tecsofec.sysventas.config;

public class RestTecsofec {
	
	private String message;
	
	
	
	public RestTecsofec(String message) {
	
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
}
