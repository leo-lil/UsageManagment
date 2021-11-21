package com.ai.openbilling.cdr.handler;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.ai.openbilling.cdr.config.PropertiesConfig;
import com.ai.openbilling.cdr.util.JsonUtil;
import com.fasterxml.jackson.databind.JsonNode;
@Component
public class ResetfulHandler {
	
	private static final Logger LOG = LoggerFactory.getLogger(ResetfulHandler.class);
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private PropertiesConfig propertiesConfig;
	
	public RestTemplate getRestTemplate() {
		return restTemplate;
	}

	public void setRestTemplate(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	public ResponseEntity<String> send(String method,String requestUrl,String requestBody,Map<String, String> headers, Map<String, Object> data) {
		String url = replaceEnv(requestUrl);
		//String method = "POST";
		String jsonBody = requestBody;
		String contentType = null;
		String jsonHeader = null;
		if (StringUtils.isNotEmpty(jsonHeader)) {
			JsonNode params = JsonUtil.parseJsonData(jsonHeader);
			if (headers == null) {
				headers = new HashMap<String, String>();
			}
			Iterator<String> it = params.fieldNames();
			while (it.hasNext()) {
				String fieldName = it.next();
				JsonNode value = ((JsonNode) params).findValue(fieldName);
				if (value != null && !value.isArray()) {
					headers.put(fieldName, value.asText());
				}
			}
		}

		switch (HttpMethod.valueOf(method)) {
		case GET:
			return callReseful(url, HttpMethod.GET, contentType, headers, jsonBody, data);
		case POST:
			return callReseful(url, HttpMethod.POST, contentType, headers, jsonBody, data);
		case PUT:
			return callReseful(url, HttpMethod.PUT, contentType, headers, jsonBody, data);
		case PATCH:
			return callReseful(url, HttpMethod.PATCH, contentType, headers, jsonBody, data);
		case DELETE:
			return callReseful(url, HttpMethod.DELETE, contentType, headers, jsonBody, data);
		default:
			//throw new Exception("Unsupport HTTP Method=" + method);
			return null;
		}
	}
	
	public ResponseEntity<String> callReseful(String url, HttpMethod method, String contentType, Map<String, String> headers, String jsonBody,
			Map<String, Object> data)  {
		
		return this.sendJson(url, method, headers, jsonBody, data);
	}
	
	
	private ResponseEntity<String> sendJson(String url, HttpMethod method, Map<String, String> headerParams, String jsonBody, Map<String, Object> data) {
		url = convertUrl(url, data);
		jsonBody = JsonUtil.convertContext(jsonBody, data);
		
		LOG.debug("### - url=" + url);
		LOG.debug("### - method=" + method.name());
		LOG.debug("### - sendContext=" + jsonBody);
		HttpHeaders headers = new HttpHeaders();// header鍙傛暟
		headers.setContentType(MediaType.APPLICATION_JSON);
		this.addRequestHeaders(headers, headerParams);
		HttpEntity<String> entity = new HttpEntity<String>(jsonBody, headers);
		ResponseEntity<String> response = restTemplate.exchange(url, method, entity, String.class);
		String returnText = response.getBody();
		int status =response.getStatusCode().value();
		LOG.debug("### - receiveText=" + returnText);
		LOG.debug("### - status=" + status);
		return response;
	}
	
	@SuppressWarnings("rawtypes")
	protected MultiValueMap<String, String> buildFormatData(String context, Map<String, Object> data) {
		MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();
		Map maps = JsonUtil.json2Object(Map.class, context);
		for (Object item : maps.keySet()) {
			String key = item.toString();
			String value = maps.get(item).toString();
			map.add(key, value);
		}
		return map;
	}
	private void addRequestHeaders(HttpHeaders headers, Map<String, String> headerParams) {
		if (headerParams != null && !headerParams.isEmpty()) {
			for (String item : headerParams.keySet()) {
				headers.set(item, headerParams.get(item));
			}
		}
	}

	private String convertUrl(String url, Map<String, Object> data) {
		if (url == null || !url.matches(".*\\$\\{[^{}]+\\}.*") || data == null) {
			return url;
			
		}
		String regex = "\\$\\{([^{}]+)\\}";
		Pattern pattern = Pattern.compile(regex);
		Matcher mat = pattern.matcher(url);
		while (mat.find()) {
			String path = mat.group(1);
			Object value = data.get(path);
			if (value != null) {
				url = url.replaceAll("\\$\\{" + path + "\\}", value.toString());
				LOG.debug("#### - mapping ${" + path + "}=" + value.toString());
			}
		}
		return url;
	}
	
	private String replaceEnv(String requestUrl) {
		return requestUrl;
	}
}

