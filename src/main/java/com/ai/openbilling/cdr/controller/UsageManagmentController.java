package com.ai.openbilling.cdr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ai.openbilling.cdr.domain.Usage;
import com.ai.openbilling.cdr.service.UsageManagmentService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@Api(tags = "UsageManagmentController", description = "Usage Managment")
@RequestMapping("/usageManagment")
public class UsageManagmentController {
	@Autowired
	private UsageManagmentService usageManagmentService;
	
	@ApiOperation(value="Query usage")
	@RequestMapping(value = "/queryAll",method= {RequestMethod.GET})
	public ResponseEntity<List<Usage>> listUsage(@RequestParam(value = "fields", required = false) String fields,@RequestParam(value = "offset", required = false) Integer offset,
			@RequestParam(value = "limit", required = false) Integer limit){
		 return new ResponseEntity<List<Usage>>(HttpStatus.OK);
	}
	
	@ApiOperation(value="Query usage")
	@RequestMapping(value = "/queryAll1",method= {RequestMethod.GET})
	public ResponseEntity<List<Usage>> listUsage1(@RequestParam(value = "fields", required = false) String fields,@RequestParam(value = "offset", required = false) Integer offset,
			@RequestParam(value = "limit", required = false) Integer limit){
		 return new ResponseEntity<List<Usage>>(HttpStatus.OK);
	}
}
