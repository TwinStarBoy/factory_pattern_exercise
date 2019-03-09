package com.org.designpattern.factory.abstractFactory;

/**
 * Created by Administrator on 2019/3/9.
 */
public class ColorTVFunction implements IFunction {
    @Override
    public void printFunction() {
        System.out.println("我能播放电视");
    }
}
