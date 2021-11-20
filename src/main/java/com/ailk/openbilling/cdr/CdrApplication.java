package com.ailk.openbilling.cdr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.aop.AopAutoConfiguration;
import org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration;
import org.springframework.boot.autoconfigure.quartz.QuartzAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.transaction.TransactionAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication(exclude= {GsonAutoConfiguration.class,QuartzAutoConfiguration.class,AopAutoConfiguration.class,TransactionAutoConfiguration.class,SecurityAutoConfiguration.class})

public class CdrApplication {

	public static void main(String[] args) {
        System.setProperty("app_tenant_id","21");
        System.setProperty("tenant_id","21");
        System.setProperty("xcCache","false");
        System.setProperty("xc","false");
        System.setProperty("route.query.mode","1");//路由查询去MDB查 2去DB查
        System.setProperty("ts.enable","true");//启用TS
        SpringApplication.run(CdrApplication.class, args);
    }

}
