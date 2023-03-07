package com.cyient.sample.application.controllers;

import java.util.Date;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import com.cyient.sample.application.dao.impl.LoactionDetailsDAO;
import com.cyient.sample.application.entities.LocationDetail;
import com.cyient.sample.application.interfaces.ISampleService;
import com.cyient.sample.application.utils.ConfigurationParameters;
import com.cyient.sample.application.utils.ValidateObject;
import com.cyient.sample.application.vo.LocationDetails;
import com.cyient.sample.application.vo.RequestObj;
import com.cyient.sample.application.vo.ResponseObj;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class SampleServiceImpl implements ISampleService{

	private static final Logger logger = LoggerFactory.getLogger(SampleServiceImpl.class);
	private static String className = "SampleService";

	@Autowired
	ValidateObject validateModel;

	@Autowired
	ConfigurationParameters configParamenets;

	@Autowired
	LoactionDetailsDAO locationDetailsdao;

	@Override
	public ResponseEntity<Object> createFlatDetails(@RequestHeader Map<String, String> headers,
			@RequestBody RequestObj requestObj) {
		String methodName = "createFlatDetails";
		ResponseObj responseObj = new ResponseObj();
		ResponseEntity<Object> httpResponseObj = null;
		ObjectMapper oMapper = new ObjectMapper();
		Date startDate = new Date();
		HttpStatus httpStatusCode = HttpStatus.ACCEPTED;
		try {
			logger.info(String.format(className,"::",methodName,"::","StartDate","::",startDate));

			System.out.println(configParamenets.getDbURL());
			boolean isValidRequest = validateModel.validateData(requestObj, responseObj);
			if (!isValidRequest) {
				httpStatusCode = HttpStatus.BAD_REQUEST;
			} 

			locationDetailsdao.getAllLocationDetails();
			
			LocationDetails reqLocationDetails=requestObj.getLocationDetails();
			LocationDetail locationDetails=new LocationDetail();
			
			locationDetails.setBuildingName(reqLocationDetails.getBuildingName());
			locationDetails.setLandMark(reqLocationDetails.getLandMark());
			locationDetails.setLatitude(reqLocationDetails.getLatitude());
			locationDetails.setLocationDetails(reqLocationDetails.getLocationDetails());
			locationDetails.setLocationId(reqLocationDetails.getBuildingName());
			locationDetails.setLongitude(reqLocationDetails.getLongitude());
			locationDetails.setPlotDetails(reqLocationDetails.getPlotDetails());
			
			boolean isSaved=locationDetailsdao.saveLocationDetails(locationDetails);
			System.out.println("isSaved : "+isSaved);
			
			responseObj.setStatus("@ACK");
			responseObj.setErrorMessage(null);
			httpStatusCode = HttpStatus.OK;
		} catch (Exception e) {
			StackTraceElement[] elements = e.getStackTrace();
			logger.info(className + "::" + methodName + "::" + " Exception in processing :: " + elements[0] + "\n"
					+ elements[1] + "\n" + elements[2]);
		} finally {
			try {
				Date endDate = new Date();
				httpResponseObj = new ResponseEntity<Object>(responseObj, httpStatusCode);
				logger.info(className , "::" ,methodName, "::" , "End Date :: " , endDate + "::Status Code ::"
						, httpStatusCode.value() , "::Response::" , oMapper.writeValueAsString(responseObj));
			} catch (Exception e) {
				StackTraceElement[] elements = e.getStackTrace();
				logger.info(className , "::" , methodName , "::", " Exception in processing finally block::"
						, elements[0] , "\n" , elements[1] , "\n", elements[2]);
			}
		}

		return httpResponseObj;
	}

	public static void main(String[] args) {

	}

	@Override
	public ResponseEntity<Object> createFlatDetailsGet(Map<String, String> headers, RequestObj requestObj) {
		// TODO Auto-generated method stub
		return new ResponseEntity<Object>("GET Method response", HttpStatus.OK);
	}
}
