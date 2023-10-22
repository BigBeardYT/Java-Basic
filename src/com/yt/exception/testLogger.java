package com.yt.exception;

import com.sun.tools.javac.Main;

import java.io.UnsupportedEncodingException;
import java.util.logging.Logger;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class testLogger {
    public static void main(String[] args) {
        /**
         * Commons Logging的特色是，它可以挂接不同的日志系统，并通过配置文件指定挂接的日志系统。默认情况下，Commons Loggin自动搜索
         * 并使用Log4j（Log4j是另一个流行的日志系统），如果没有找到Log4j，再使用JDK Logging。
         */
        Log log = LogFactory.getLog(Main.class);
        log.info("start...");
        log.warn("end.");



        Logger logger = Logger.getLogger(Main.class.getName());
        logger.info("Start Process...");
        try {
            "".getBytes("invalidCharseName");
        } catch (UnsupportedEncodingException e) {
            logger.severe("不支持的编码格式");
        }
        logger.info("Process End");

    }
}
