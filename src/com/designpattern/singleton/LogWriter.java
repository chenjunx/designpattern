package com.designpattern.singleton;

import java.io.*;

/**
 * 日志执行类
 */
public class LogWriter {

    public static LogWriter logWriter;

    private LogWriter(){}

    public static  synchronized LogWriter getInstance(){
        if (logWriter ==null){
            return new LogWriter();
        } else {
            return logWriter;
        }
    }
    public synchronized  void write(String msg) throws IOException {
        FileWriter fw = new FileWriter(LogWriter.class.getResource("singleton.log").getFile(),true);
        fw.write(msg);
        fw.flush();
        fw.close();
    }
}
