package com.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.service.ReactiveAutenticationService;

@RestController
@RequestMapping("/api/v2")
public class ApiController {
	
	@Autowired
	private ReactiveAutenticationService reactiveAutenticationService;
	
}
