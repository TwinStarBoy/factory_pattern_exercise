package com.org.designpattern.factory.abstractFactory;

/**
 * Created by Administrator on 2019/3/9.
 */
public class ColorTVName implements IName {
    @Override
    public void printName() {
        System.out.println("我是彩电");
    }
}
