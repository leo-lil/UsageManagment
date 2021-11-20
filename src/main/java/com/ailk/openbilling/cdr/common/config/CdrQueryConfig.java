package com.ailk.openbilling.cdr.common.config;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import com.ailk.easyframe.web.common.session.AilkSessionFilter;
@Configuration
@ImportResource({"classpath:/META-INF/rating_cdrquery_applicationContext.xml","classpath:rating_cdrquery_datasource.xml"})

public class CdrQueryConfig {
	@Bean
    public FilterRegistrationBean<AilkSessionFilter> registFilter() {
        FilterRegistrationBean<AilkSessionFilter> registration = new FilterRegistrationBean<AilkSessionFilter>();
        registration.setFilter(new AilkSessionFilter());
        registration.addUrlPatterns("/*");
        registration.setName("ailkFilter");
        registration.setOrder(1);
        return registration;
    }
}
