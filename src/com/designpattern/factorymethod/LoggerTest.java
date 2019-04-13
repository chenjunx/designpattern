package com.designpattern.factorymethod;

import java.io.IOException;
import java.util.Properties;

/**
 * application object
 */
public class LoggerTest {
    public static void main(String[] args) throws IOException {
        //非工厂实现
        nonFactoryImplement();
        System.out.println("--------");
        //工厂实现
        factoryImplement();
        System.out.println("--------");
        //新的DB记录实现
        dbFactoryImplement();
    }

    /**
     * 非工厂实现
     * @throws IOException
     */
    public static void nonFactoryImplement() throws IOException {
        Properties prop = new Properties();
        prop.load(LoggerTest.class.getResourceAsStream("config.properties"));
        if(Boolean.parseBoolean(prop.getProperty("fileLogEnable"))){
            FileLogger fileLogger = new FileLogger();
            fileLogger.log("AAA");
        } else {
            ConsoleLogger consoleLogger = new ConsoleLogger();
            consoleLogger.log("AAA");
        }

    }

    public static void  factoryImplement() throws IOException{
        LoggerFactory loggerFactory = new ConcreteCreator();
        loggerFactory.getLogger().log("AAA");
    }


    public static void dbFactoryImplement() throws IOException{
        LoggerFactory loggerFactory = new DBCreator();
        loggerFactory.getLogger().log("AAA");

    }
}
