package com.yt.exception;

import com.sun.tools.javac.Main;

import java.io.UnsupportedEncodingException;
import java.util.logging.Logger;

public class testLogger {
    public static void main(String[] args) {
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
