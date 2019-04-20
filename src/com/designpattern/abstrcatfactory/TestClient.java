package com.designpattern.abstrcatfactory;

import java.rmi.RemoteException;

/**
 * 执行类
 */
public class TestClient {
    public static void main(String[] args) throws RemoteException {
        String mode = "remote";
        Address address = null;
        if(mode.equals("local")){
            address=  new LocalFactory().getAddress();
        } else {
            address = new RemoteFactory().getAddress();
        }
        address.getAddress();
    }
}
