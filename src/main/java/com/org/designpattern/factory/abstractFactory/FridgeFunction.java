package com.org.designpattern.factory.abstractFactory;

/**
 * Created by Administrator on 2019/3/9.
 */
public class FridgeFunction implements IFunction {
    @Override
    public void printFunction() {
        System.out.println("我能制冷");
    }
}
