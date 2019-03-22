package com.icon.foundation.springboottestingpractice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.icon.foundation.springboottestingpractice.service.TestService;

@RestController
@RequestMapping("")
public class TestController {
	
	TestService testService;
	
	public TestController(TestService testService) {
		this.testService = testService;
	}

	@GetMapping
	public String testMethod() {
		return testService.test();
	}
}
