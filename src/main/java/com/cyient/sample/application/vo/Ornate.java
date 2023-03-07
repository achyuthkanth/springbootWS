package com.cyient.sample.application.vo;

import javax.validation.constraints.NotBlank;

/**
 * 
 * @author Achyuth Kanth Pamuru
 *
 */
public class Ornate {
	
	@NotBlank(message = "flatNo in Ornate is mandatory")
	private String flatNo;
	private String floorNo;
	private String parkingNo;
	private String houseFacing;
	private String flotSFT;
	
	public String getFlatNo() {
		return flatNo;
	}
	public void setFlatNo(String flatNo) {
		this.flatNo = flatNo;
	}
	public String getFloorNo() {
		return floorNo;
	}
	public void setFloorNo(String floorNo) {
		this.floorNo = floorNo;
	}
	public String getParkingNo() {
		return parkingNo;
	}
	public void setParkingNo(String parkingNo) {
		this.parkingNo = parkingNo;
	}
	public String getHouseFacing() {
		return houseFacing;
	}
	public void setHouseFacing(String houseFacing) {
		this.houseFacing = houseFacing;
	}
	public String getFlotSFT() {
		return flotSFT;
	}
	public void setFlotSFT(String flotSFT) {
		this.flotSFT = flotSFT;
	}

}
