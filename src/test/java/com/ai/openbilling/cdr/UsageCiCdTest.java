package com.ai.openbilling.cdr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import com.ai.openbilling.cdr.controller.UsageManagmentController;

@SpringBootTest(classes = UsageCicdApplication.class)
public class UsageCiCdTest extends AbstractTestNGSpringContextTests {

	@Autowired
	private  UsageManagmentController UsageManagmentController;
	
	@Test
    public void testUsageQry(){
		String fields="";
		Integer offset=1;
		Integer limit=10;
		System.out.println("testUsageQry");
    }
}
