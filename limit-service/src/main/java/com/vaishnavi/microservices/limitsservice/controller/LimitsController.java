package com.vaishnavi.microservices.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vaishnavi.microservices.limitsservice.bean.Limits;
import com.vaishnavi.microservices.limitsservice.configuration.Configuration;

@RestController
public class LimitsController {
	
	@Autowired
	private Configuration confiuration;

	@GetMapping("/limits")
	public Limits retrieveLimits() {
		return new Limits(confiuration.getMinimum(),confiuration.getMaximum());
//		return new Limits(1,1000);
	}
}
