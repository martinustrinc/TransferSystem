package com.example.transfersystem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLog {
    private static final Logger logger = LoggerFactory.getLogger(TestLog.class);

    public void myMethod() {
        logger.debug("Debug message");
        logger.info("Info message");
        logger.warn("Warning message");
        logger.error("Error message");
    }
}
