package com.icon.foundation.springboottestingpractice;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.icon.foundation.springboottestingpractice.repository.TestRepository;
import com.icon.foundation.springboottestingpractice.service.TestService;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class TestSpringBootTestingPracticeApplicationTests {
	
	@Autowired
	MockMvc mvc;

//	@MockBean
//	TestService testService;
	
	@MockBean
	TestRepository testRepository;
	
	@Before
	public void setup() {
//		when(testService.test()).thenReturn("mock yohooo!");
		when(testRepository.getTestString()).thenReturn("yolsososo");
	}
	
	@Test
	public void contextLoads() {
	}
	
	@Test
	public void test() {
		try {
			mvc.perform(get("/")).andDo(print());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
