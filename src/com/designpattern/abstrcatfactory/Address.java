package com.designpattern.abstrcatfactory;

public interface Address {
    /**
     * 校验是否有效
     * @return
     */
    public  boolean isValid();

    /**
     *保存
     * @return
     */
    public  boolean save();


    /**
     * 获取地址
     * @return
     */
    public  String getAddress();


    /**
     * 获取状态
     * @return
     */
    public  String getState();
}
