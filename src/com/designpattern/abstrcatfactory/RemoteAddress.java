package com.designpattern.abstrcatfactory;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.RMIClientSocketFactory;
import java.rmi.server.RMIServerSocketFactory;
import java.rmi.server.UnicastRemoteObject;

/**
 * 远程模式
 */
public class RemoteAddress extends UnicastRemoteObject implements Address, Remote {


    protected RemoteAddress() throws RemoteException {
    }

    protected RemoteAddress(int port) throws RemoteException {
        super(port);
    }

    protected RemoteAddress(int port, RMIClientSocketFactory csf, RMIServerSocketFactory ssf) throws RemoteException {
        super(port, csf, ssf);
    }

    public boolean isValid() {
        System.out.println("[remote] valid");
        return false;
    }


    public boolean save() {
        System.out.println("[remote] save");
        return false;
    }

    public String getAddress() {
        System.out.println("[remote] ");
        return "10.*.*.*";
    }

    public String getState() {
        System.out.println("[remote] ");
        return "good";
    }
}
