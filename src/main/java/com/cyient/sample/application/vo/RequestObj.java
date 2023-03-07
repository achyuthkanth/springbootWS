package com.cyient.sample.application.vo;

import java.util.List;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * @author Achyuth Kanth Pamuru
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RequestObj {
	
	@JsonProperty("locationDetails")
	@Valid
	private LocationDetails locationDetails;
	
	@JsonProperty("ornateDetails")
	@Valid
	private List<Ornate> ornateDetails;
	
	public LocationDetails getLocationDetails() {
		return locationDetails;
	}
	public void setLocationDetails(LocationDetails locationDetails) {
		this.locationDetails = locationDetails;
	}
	public List<Ornate> getOrnateDetails() {
		return ornateDetails;
	}
	public void setOrnateDetails(List<Ornate> ornateDetails) {
		this.ornateDetails = ornateDetails;
	}
	
	
	
	

}
