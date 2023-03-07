package com.cyient.sample.application.utils;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Valid;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidateModel<T> {
	
	@Autowired
	private Validator validator;
	
	public Set<ConstraintViolation<@Valid T>> validateRequestModel(T model) {
		return validator.validate(model);
	}

}
