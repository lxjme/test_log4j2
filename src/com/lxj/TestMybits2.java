package com.lxj;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * TestMybits2
 */
public class TestMybits2 {
    private static Logger logger = LogManager.getLogger(TestMybits2.class);

    public static void main(String[] args) {
        logger.info("8888");
        logger.error("8888");
        logger.warn("警告信息");
        logger.error("错误信息");
        logger.fatal("致命信息");
    }
}