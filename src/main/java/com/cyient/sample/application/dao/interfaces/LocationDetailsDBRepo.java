package com.cyient.sample.application.dao.interfaces;

import org.springframework.data.repository.CrudRepository;

import com.cyient.sample.application.entities.LocationDetail;

public interface LocationDetailsDBRepo extends CrudRepository<LocationDetail, Integer> {
	
	
}
