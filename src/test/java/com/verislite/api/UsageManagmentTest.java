package com.verislite.api;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ai.openbilling.cdr.UsageCicdApplication;
import com.ai.openbilling.cdr.controller.UsageManagmentController;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = UsageCicdApplication.class)
public class UsageManagmentTest  {

	@Autowired
	private  UsageManagmentController UsageManagmentController;
	@Test
    public void testUsageQry(){
		String fields="";
		Integer offset=1;
		Integer limit=10;
		
		System.out.println("testUsageQry");
    }
	
	@Test
    public void testUsageQry2(){
		String fields="";
		Integer offset=1;
		Integer limit=10;
		
		System.out.println("testUsageQry2");
    }
}
