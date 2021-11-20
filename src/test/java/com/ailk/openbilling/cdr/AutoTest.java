package com.ailk.openbilling.cdr;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AutoTest {
	
	protected static ApplicationContext appCtx;
	
	@BeforeClass
	public static void before() {
		appCtx =new ClassPathXmlApplicationContext(new String[] {"classpath:/META-INF/rating_cdrquery_applicationContext.xml","classpath:rating_cdrquery_datasource.xml"});
	}
	
	@AfterClass
	public static void after() {
		
	}
	
	@Test
	public static void test() throws InterruptedException {
		
		
	}

}