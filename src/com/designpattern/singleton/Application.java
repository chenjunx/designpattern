package com.designpattern.singleton;

import java.io.IOException;

/**
 * 执行类
 * 为了防止多个client端访问同一资源造成问题，可以将访问方式建成单例模式，访问资源方式加同步锁。
 */
public class Application {

    public static void main(String[] args) throws IOException {
        LogWriter lw = LogWriter.getInstance();
        lw.write("bbb \n");
        LogWriter lw1 =  LogWriter.getInstance();
        lw1.write("aaa \n");
    }
}
