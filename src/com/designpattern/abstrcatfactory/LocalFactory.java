package com.designpattern.abstrcatfactory;

import java.rmi.RemoteException;

/**
 * 抽象工厂的具体实现类
 */
public class LocalFactory implements AbstrcatFactory {

    @Override
    public Address getAddress() {
        return new LocalAddress();
    }
}
