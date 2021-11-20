package com.ailk.openbilling.cdr.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * Created with IDEA
 * User: Elijah
 * Date: 2018/8/29 14:55
 * Describe:
 */
public class DateUtil {
    
    private static final Logger LOG = LoggerFactory.getLogger(DateUtil.class);
    private static final List<String> formats = new ArrayList<String>();
    private static final List<String> patterns = new ArrayList<String>();
    static {
        formats.add("yyyy-MM");
        formats.add("yyyy-MM-dd");
        formats.add("yyyy-MM-dd HH:mm");
        formats.add("yyyy-MM-dd HH:mm:ss");
        formats.add("yyyy/MM");
        formats.add("yyyy/MM/dd");
        formats.add("yyyy/MM/dd HH:mm");
        formats.add("yyyy/MM/dd HH:mm:ss");
        formats.add("yyyyMMddHHmmss");

        patterns.add("^\\d{4}-\\d{1,2}$");
        patterns.add("^\\d{4}(-\\d{1,2}){2}$");
        patterns.add("^\\d{4}(-\\d{1,2}){2} +\\d{1,2}:\\d{1,2}$");
        patterns.add("^\\d{4}(-\\d{1,2}){2} +\\d{1,2}(:\\d{1,2}){2}$");
        patterns.add("^\\d{4}/\\d{1,2}$");
        patterns.add("^\\d{4}(/\\d{1,2}){2}$");
        patterns.add("^\\d{4}(/\\d{1,2}){2} +\\d{1,2}:\\d{1,2}$");
        patterns.add("^\\d{4}(/\\d{1,2}){2} +\\d{1,2}(:\\d{1,2}){2}$");
        patterns.add("^\\d{14}");
    }
    private static final String DEFAULT_DATE = "2037-12-31 00:00:00";
    public static final String DATE_FORMAT_YYYYMMDDHHMMSS = "yyyyMMddHHmmss";
    public static final String DATE_FORMAT_DEFAULT = "yyyy-MM-dd HH:mm:ss";
    public static final String DATE_FORMAT_DEFAULT_SHORT = "yyyy-MM-dd";
    public static final String DATE_FORMAT_DEFAULT_SHORT_8 = "yyyyMMdd";
    public static final String DATE_FORMAT_DEFAULT_SHORT_6 = "yyyyMM";
    /**
     * Date转化为XMLGregorianCalendar
     * @param date
     * @return
     */
    public static XMLGregorianCalendar convertToXMLGregorianCalendar(Date date) {
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(date);
        XMLGregorianCalendar gc = null;
        try {
            gc = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return gc;
    }

    /**
     * XMLGregorianCalendar 转Date
     * @param cal
     * @return
     */
    public static  Date convertToDate(XMLGregorianCalendar cal){
        GregorianCalendar ca = null;
        if(cal!=null && cal.toGregorianCalendar()!=null){
            ca = cal.toGregorianCalendar();
            return ca.getTime();
        }
        return null;
    }

    /**
     * 转化ｄａｔｅ
     * @param dateStr
     * @return
     */
    public static Date convert(String dateStr) {
        if(null==dateStr || dateStr.trim().length()==0){
            return null;
        }
        String value = dateStr.trim();
        for (int i = 0; i < patterns.size(); i++) {
            if (value.matches(patterns.get(i))) {
                return getDate(value, formats.get(i));
            }
        }
        return null;
    }

    /**
     *  获取默认失效时间
     * @return
     */
    public static Date getDefaultDate(){
        SimpleDateFormat formatter = new SimpleDateFormat(DATE_FORMAT_DEFAULT);
        try {
            return formatter.parse(DEFAULT_DATE);
        } catch (ParseException e) {
            LOG.error("DateUtil.getDefaultDate format error ",e);
            return null;
        }
    }

    /**
     * 获取格式化的时间
     * @param date
     * @param format
     * @return
     */
    public static String getFormatDate(Date date,String format){
        if(date==null){
            return null;
        }
        SimpleDateFormat formatter = new SimpleDateFormat(format);
        return  formatter.format(date);
    }


    /**
     * 获取格式化的时间
     * @param sdate
     * @param format
     * @return
     */
    public static Date getDate(String sdate,String format){
        if(sdate==null){
            return null;
        }
        Date date = null;
        SimpleDateFormat formatter = new SimpleDateFormat(format);
        try {
            date = formatter.parse(sdate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}
