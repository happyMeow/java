package com.example.demo.Logging;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.logging.Logger;

/**
 * Created by gqy on 2019/7/22.
 */
public class Logging {

    public static void main(String[] args)
    {
        JDKLogging();
        CommonsLogging();

    }

    private static void JDKLogging()
    {
        Logger logger = Logger.getGlobal();
        logger.info("start processing");
        logger.config("config properties");
        logger.fine("this is fine");
        logger.warning("warning");
        logger.severe("process will be terminated") ;
    }

    private static void CommonsLogging()
    {
        Log log = LogFactory.getLog(Logging.class);
        log.info("start....");
        log.warn("warning");
        log.debug("debug");
        log.error("error");
    }
}
