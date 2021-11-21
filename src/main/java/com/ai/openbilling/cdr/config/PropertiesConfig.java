package com.ai.openbilling.cdr.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "cicd")
public class PropertiesConfig {

	private int readTimeOut;
	
	private int connectTimeOut;
	
	private String cdrUrl;
	
	public int getReadTimeOut() {
		return readTimeOut;
	}

	public void setReadTimeOut(int readTimeOut) {
		this.readTimeOut = readTimeOut;
	}

	public int getConnectTimeOut() {
		return connectTimeOut;
	}

	public void setConnectTimeOut(int connectTimeOut) {
		this.connectTimeOut = connectTimeOut;
	}
	
	public String getCdrUrl() {
		return cdrUrl;
	}

	public void setCdrUrl(String cdrUrl) {
		this.cdrUrl = cdrUrl;
	}

}
