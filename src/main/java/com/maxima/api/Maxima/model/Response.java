package com.maxima.api.Maxima.model;

import java.util.List;

public class Response<T> {
	
	private String message;
	private String status;
	private List<T> result;
	
	public Response() {
		super();
	}
	
	public Response(String message, String status) {
		super();
		this.message = message;
		this.status = status;
	}

	public Response(String message, String status, List<T> result) {
		super();
		this.message = message;
		this.status = status;
		this.result = result;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public List<T> getResult() {
		return result;
	}
	
	public void setResult(List<T> result) {
		this.result = result;
	}
}
