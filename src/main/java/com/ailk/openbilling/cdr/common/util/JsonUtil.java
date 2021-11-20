package com.ailk.openbilling.cdr.common.util;

import com.ailk.easyframe.web.common.dal.IComplexEntity;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jef.database.DataObject;

import java.io.IOException;

/**
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
          if(obj instanceof IComplexEntity){
              return "###Not Support Type IComplexEntity class is:"+obj.getClass();
          }
          if(obj instanceof DataObject){
              return "###Not Support Type DataObject  class is:"+obj.getClass();
          }
          return  objectMapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return "";
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
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
