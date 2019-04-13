package com.designpattern.factorymethod;

/**
 * 记录Logger至日志
 */
public class DBLogger implements Logger {
    @Override
    public void log(String msg) {
        System.out.println("writing " +msg+ " into DB ");
    }
}
