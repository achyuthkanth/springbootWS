package com.cyient.sample.application.vo;

import javax.validation.constraints.NotNull;


/**
 * 
 * @author Achyuth Kanth Pamuru
 *
 */
public class LocationDetails {
	
	@NotNull(message = "buildingName in LocationDetails is mandatory")
	private String buildingName;
	
	@NotNull(message = "plotDetails in LocationDetails is mandatory for Site")
	private String plotDetails;
	
	private String locationDetails;
	private String latitude;
	private String longitude;
	private String landMark;
	
	public String getBuildingName() {
		return buildingName;
	}
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
	public String getPlotDetails() {
		return plotDetails;
	}
	public void setPlotDetails(String plotDetails) {
		this.plotDetails = plotDetails;
	}
	public String getLocationDetails() {
		return locationDetails;
	}
	public void setLocationDetails(String locationDetails) {
		this.locationDetails = locationDetails;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLandMark() {
		return landMark;
	}
	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}
	
	

}
