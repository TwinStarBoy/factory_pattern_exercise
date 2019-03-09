package com.org.designpattern.factory;

/**
 * Created by Administrator on 2019/3/9.
 */
public class Fridge implements IProduction {
    @Override
    public String getName() {
        String fridge = "我是冰箱";
        System.out.println(fridge);
        return fridge;
    }
}
