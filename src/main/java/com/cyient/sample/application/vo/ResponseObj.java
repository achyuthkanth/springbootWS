package com.cyient.sample.application.vo;


/**
 * 
 * @author Achyuth Kanth Pamuru
 *
 */
public class ResponseObj {
	
	private String status="@NCK";
	private String errorMessage="Error in processing request";
	private String details;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	

}
