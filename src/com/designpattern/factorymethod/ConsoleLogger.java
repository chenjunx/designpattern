package com.designpattern.factorymethod;

/**
 * 控制台日志记录者
 */
public class ConsoleLogger implements Logger {
    @Override
    public void log(String msg) {
        System.out.println("writing "+msg+" into console");
    }
}
