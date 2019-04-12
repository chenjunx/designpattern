package com.designpattern.factorymethod;

import java.io.IOException;
import java.util.Properties;

/**
 * 具体创建者
 */
public class ConcreteCreator implements LoggerFactory {
    Properties prop = new Properties();


    public ConcreteCreator() throws IOException {
        prop.load(LoggerTest.class.getResourceAsStream("config.properties"));

    }

    @Override
    public Logger getLogger() {
        if(Boolean.parseBoolean(prop.getProperty("fileLogEnable"))){
            return new FileLogger();

        } else {
            return new ConsoleLogger();
        }
    }
}
