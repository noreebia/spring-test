package com.icon.foundation.springboottestingpractice.service;

import org.springframework.stereotype.Service;

import com.icon.foundation.springboottestingpractice.repository.TestRepository;

@Service
public class TestService {
	
	TestRepository testRepository;
	
	public TestService(TestRepository testRepository) {
		this.testRepository = testRepository;
	}
	
	public String test() {
		return testRepository.getTestString();
	}
}
