package com.designpattern.factorymethod;

/**
 * 日志文件记录着
 */
public class FileLogger implements Logger {
    @Override
    public void log(String msg) {
        System.out.println("writing "+msg+" into  *.log ");
    }
}
