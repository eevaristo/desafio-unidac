package com.unidac.desafiounidac.models;


public class ApiMessage {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public ApiMessage(String message) {
		super();
		this.message = message;
	}
}
