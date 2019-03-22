package com.icon.foundation.springboottestingpractice;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.icon.foundation.springboottestingpractice.controller.TestController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestClass {
	
	@Test
	public void contextLoads() {
	}
	
	@Test
	public void printWorks() {
		System.out.println("yoho");
	}
	
	@Autowired
	MockMvc mvc;
	
	@Autowired
	TestController testController;

//	@Test
//	public void contextLoads() {
//	}
	
	@Test
	public void testController() {
		try {
			mvc.perform(get("/")).andDo(print());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
