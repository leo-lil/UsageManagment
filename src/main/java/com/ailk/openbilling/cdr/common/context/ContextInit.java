package com.ailk.openbilling.cdr.common.context;
import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ailk.easyframe.web.common.session.ContextHolder;
import com.ailk.openbilling.cdr.common.config.PropertiesConfig;


@Component 
public class ContextInit {
	private static final Logger LOG = LoggerFactory.getLogger(ContextInit.class); 
	
	@Autowired
	private PropertiesConfig config;
	
	@PostConstruct
	public void init() {
		LOG.info("ContextInit init ,set tenantId="+config.getTenantId());
		ContextHolder.setApplicationTenantId(config.getTenantId());
	}
}
