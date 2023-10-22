package com.yt.exception;
import com.sun.tools.javac.Main;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogBuilder;
public class testLog4j {
    public static void main(String[] args) {
        Logger logger = (Logger) LogFactory.getLog(Main.class);
        logger.info("start...");

    }
}
