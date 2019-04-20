package com.designpattern.abstrcatfactory;

public class LocalAddress implements Address {
    @Override
    public boolean isValid() {
        System.out.println("[local] valid");
        return false;
    }

    @Override
    public boolean save() {
        System.out.println("[local] save");
        return false;
    }

    @Override
    public String getAddress() {
        System.out.println("[local] ");
        return "lcoalhost";
    }

    @Override
    public String getState() {
        System.out.println("[local] ");
        return "good";
    }
}
