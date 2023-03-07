package com.cyient.sample.application.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.validation.ConstraintViolation;
import javax.validation.Valid;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.cyient.sample.application.vo.ResponseObj;

@Service
public class ValidateObject {

	@Autowired
	private Validator validator;

	ValidateObject(Validator validator) {
		this.validator = validator;
	}

	public List<String> validateInputWithInjectedValidator(Object object) {
		List<String> voilationMessage=new ArrayList<String>();
		try {
			Set<ConstraintViolation<@Valid Object>> violations = validator.validate(object);
			if (!violations.isEmpty()) {
				voilationMessage = violations.stream().map(ConstraintViolation::getMessage).collect(Collectors.toList());
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return voilationMessage;
	}
	
	
	public boolean validateData(Object object,ResponseObj responseObj) {
		boolean isValidRequest=false;
		try {
			List<String> voilationMessage=validateInputWithInjectedValidator(object);
			
			if(!voilationMessage.isEmpty()) {
				String errorMessage=String.join(",", voilationMessage);
				responseObj.setErrorMessage(errorMessage);
			}else {
				isValidRequest=true;
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return isValidRequest;
	}
	
	
	
	
}
