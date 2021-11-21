package com.ai.openbilling.cdr.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.beanutils.BeanUtils;

/**
 * JSON 工具类 反json化对象  或者JSON化对象
 * Created with IDEA
 * User: Elijah
 * Date: 2020/1/2 10:41
 * Describe:
 */
public class JsonUtil {

    /**
     * 对象转化为 str
     * @param obj
     * @return
     */
    public static String toString(Object obj){
        ObjectMapper objectMapper = new ObjectMapper();
        try {
          if(null == obj){
              return "";
          }
          return  objectMapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return "";
    }

    public static void main(String[] args) {

    }

    /**
     * str转化为对象
     * @param str
     * @param C
     * @param <T>
     * @return
     */
    public static <T>T toObj(String str,Class<T> C){
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            T obj = (T)objectMapper.readValue(str,C);
            return obj;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    /**
	 * Convert context.
	 *
	 * @param context the context
	 * @param data    the data
	 * @return the string
	 */
	public static String convertContext(String context,Object data) {
		if (context == null || context.indexOf("$") == -1 || data == null) {
			return context;
		}
		String regex = "\\$\\{([a-zA-Z0-9_]+)\\}";
		Pattern pattern = Pattern.compile(regex);
		Matcher mat = pattern.matcher(context);
		while (mat.find()) {
			String path = mat.group(1);
			if (data instanceof Map) {
				Object value = ((Map<?, ?>)data).get(path);
				if (value != null) {
					context = context.replaceAll("\\$\\{" + path + "\\}", value.toString());
				}
			}else if (data instanceof JsonNode) {
				String value = ((JsonNode)data).asText();
				if (value != null) {
					context = context.replaceAll("\\$\\{" + path + "\\}", value);
				}
			} else {
				String value = null;
				try {
					value = BeanUtils.getProperty(data, path);
				} catch (Exception e) {
				}
				if (value != null) {
					context = context.replaceAll("\\$\\{" + path + "\\}", value.toString());
				}
			}
			
		}
		return context;
	}
	
	/**
	 * Json 2 map.
	 *
	 * @param <T> the generic type
	 * @param clazz the clazz
	 * @param json the json
	 * @return the map
	 */
	public static <T> T json2Object(Class<T> clazz, String json) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			return mapper.readValue(json, clazz);
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * Parses the json data.
	 *
	 * @param jsonData the json data
	 * @return the json node
	 */
	public static JsonNode parseJsonData(String jsonData) {
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			return objectMapper.readTree(jsonData);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
