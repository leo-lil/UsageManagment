package com.ai.openbilling.cdr.handler;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
@ControllerAdvice
public class GlobalExceptionHandler {
	private static final Logger LOG = LoggerFactory.getLogger(GlobalExceptionHandler.class);
	
	@ResponseBody
    @ExceptionHandler(value = Exception.class)
    @ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
    public Map<String, Object> handleException(Exception ex) {
		//LOG.error("combo运行时异常>>>>>>>>"+ex.getMessage());
		ex.printStackTrace();
		Map<String, Object> map = new HashMap<>();
        map.put("code", 500);
        map.put("message", "Internal Server Error");
        map.put("reason", "");
        map.put("status", "500");
        map.put("referenceError", "");
        map.put("@baseType", "");
        map.put("@schemaLocation", "");
        map.put("@type", "");
        return map;
    }
	
	@ResponseBody
    @ExceptionHandler(value = BusinessException.class)
    @ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
    public Map<String, Object> handle(BusinessException ex) {
		//LOG.error("combo业务异常>>>>>>>>"+ex.getMessage());
        ex.printStackTrace();
		Map<String, Object> map = new HashMap<>();
        map.put("code", ex.getErrorCode());
        map.put("message", ex.getMessage());
        map.put("reason", ex.getMessage());
        map.put("status", "500");
        map.put("referenceError", "");
        map.put("@baseType", "");
        map.put("@schemaLocation", "");
        map.put("@type", "");
        return map;
    }
}
