package com.cyient.sample.application.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Id;


/**
 * The persistent class for the location_details database table.
 * 
 */
@Entity
@Table(name="location_details")
@NamedQuery(name="LocationDetail.findAll", query="SELECT l FROM LocationDetail l")
public class LocationDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="location_id")
	private String locationId;

	@Column(name="building_name")
	private String buildingName;

	@Column(name="land_mark")
	private String landMark;

	private String latitude;

	@Column(name="location_details")
	private String locationDetails;

	private String longitude;

	@Column(name="plot_details")
	private String plotDetails;

	public LocationDetail() {
	}

	public String getLocationId() {
		return this.locationId;
	}

	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}

	public String getBuildingName() {
		return this.buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public String getLandMark() {
		return this.landMark;
	}

	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}

	public String getLatitude() {
		return this.latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLocationDetails() {
		return this.locationDetails;
	}

	public void setLocationDetails(String locationDetails) {
		this.locationDetails = locationDetails;
	}

	public String getLongitude() {
		return this.longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getPlotDetails() {
		return this.plotDetails;
	}

	public void setPlotDetails(String plotDetails) {
		this.plotDetails = plotDetails;
	}

}