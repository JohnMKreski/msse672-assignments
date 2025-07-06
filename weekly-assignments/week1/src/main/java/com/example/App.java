package com.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
    private static final Logger logger = LogManager.getLogger(App.class);

    public static void main(String[] args) {
        logger.info("Hello, World!");
        logger.debug("This is a debug message (will only show if level is set to DEBUG).");
        logger.warn("This is a warning message.");
        logger.error("This is an error message.");
        logger.fatal("This is a fatal error message.");
    }
}
