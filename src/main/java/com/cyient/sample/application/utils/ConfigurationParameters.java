package com.cyient.sample.application.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties
public class ConfigurationParameters {
	
	
	@Value("${spring.datasource.url}")
	String dbURL;

	public String getDbURL() {
		return dbURL;
	}

	public void setDbURL(String dbURL) {
		this.dbURL = dbURL;
	}

	
	
	

}
