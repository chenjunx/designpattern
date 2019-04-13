package com.designpattern.factorymethod;

import java.io.IOException;
import java.util.Properties;

public class DBCreator implements LoggerFactory {
    Properties prop = new Properties();


    public DBCreator() throws IOException {
        prop.load(LoggerTest.class.getResourceAsStream("config.properties"));

    }

    @Override
    public Logger getLogger() {
        return new DBLogger();
    }
}
