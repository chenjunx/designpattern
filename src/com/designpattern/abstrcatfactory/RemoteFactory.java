package com.designpattern.abstrcatfactory;

import java.rmi.RemoteException;

/**
 * 抽象工厂的具体实现
 */
public class RemoteFactory implements AbstrcatFactory {
    @Override
    public Address getAddress() throws RemoteException {
        return new RemoteAddress();
    }
}
