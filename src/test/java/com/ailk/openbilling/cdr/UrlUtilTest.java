package com.ailk.openbilling.cdr;
import com.ailk.openbilling.cdr.common.config.PropertiesConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created with IDEA
 * User: Elijah
 * Date: 2018/8/29 11:08
 * Describe:
 */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class UrlUtilTest {

    @Autowired
    PropertiesConfig config;


    @Test
    public void test(){
        System.setProperty("app_tenant_id","21");
        System.setProperty("tenant_id","21");
        System.setProperty("xcCache","false");
        System.setProperty("xc","false");
        System.setProperty("route.query.mode","1");//路由查询去MDB查 2去DB查
    }

}
