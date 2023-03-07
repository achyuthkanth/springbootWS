package com.cyient.sample.application.interfaces;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cyient.sample.application.vo.RequestObj;


@RestController
@RequestMapping(value = "/SampleWs")
public interface ISampleService {
	
	@PostMapping("/SamplePost")
	public ResponseEntity<Object> createFlatDetails(@RequestHeader Map<String, String> headers,
			@RequestBody RequestObj requestObj);
	
	@GetMapping("/SampleGet")
	public ResponseEntity<Object> createFlatDetailsGet(@RequestHeader Map<String, String> headers,
			@RequestBody RequestObj requestObj);

}
