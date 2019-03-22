package com.icon.foundation.springboottestingpractice.repository;

import org.springframework.stereotype.Repository;

@Repository
public class TestRepository {
	
	private static final String testString = "aaaaaaahhhhh";
	
	public String getTestString() {
		return testString;
	}
}
