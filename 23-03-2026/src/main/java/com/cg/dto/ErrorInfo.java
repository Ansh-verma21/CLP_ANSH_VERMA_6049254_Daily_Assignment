package com.cg.dto;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

public class ErrorInfo {
	private String message;
	private int statusCode;
	private HttpStatus httpStatus;
	public ErrorInfo(String message, int statusCode, HttpStatus httpStatus, LocalDateTime timestamp) {
		super();
		this.message = message;
		this.statusCode = statusCode;
		this.httpStatus = httpStatus;
		this.timestamp = timestamp;
	}
	public String getMessage() {
		return message;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public HttpStatus getHttpStatus() {
		return httpStatus;
	}
	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}
	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
	private LocalDateTime timestamp;

}
