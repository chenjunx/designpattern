package com.designpattern.abstrcatfactory;

import java.rmi.RemoteException;

/**
 * 抽象工厂用于定义不同的功能
 */
public interface AbstrcatFactory {
   Address getAddress() throws RemoteException;
}
