package com.cyient.sample.application.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cyient.sample.application.dao.interfaces.LocationDetailsDBRepo;
import com.cyient.sample.application.entities.LocationDetail;

@Service
public class LoactionDetailsDAO {

	@Autowired
	LocationDetailsDBRepo dbRepository;

	public List<LocationDetail> getAllLocationDetails() {
		List<LocationDetail> locationsList=(List<LocationDetail>) dbRepository.findAll();
		System.out.println(locationsList);
		return locationsList;
	}
	
	public boolean saveLocationDetails(LocationDetail locationDetail) {
		boolean isSaved=false;
		
		try {
			isSaved=dbRepository.save(locationDetail) != null;
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return isSaved;
	}


}
