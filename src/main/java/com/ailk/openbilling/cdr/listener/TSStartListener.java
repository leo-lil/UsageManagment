package com.ailk.openbilling.cdr.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.ailk.easyframe.common.log.LoggerFactory;
import com.ailk.ts.TS;
@WebListener
public class TSStartListener implements ServletContextListener
{
    private static com.ailk.easyframe.common.log.Logger logger = LoggerFactory.getLogger(TSStartListener.class);

    public void contextInitialized(ServletContextEvent sce)
    {
        logger.info("ServletContextEvent event contextInitialized..");
        startTsIfNot();
    }

    
    public static synchronized void startTsIfNot()
    {
        logger.info("enter TSStartListener.startTsIfNot");
        try
        {
            new TS().tsRun(null);
        }
        catch (Exception t)
        {
            logger.error("TS start failed", t);
        }
    }

    public void contextDestroyed(ServletContextEvent sce)
    {
    }
}
