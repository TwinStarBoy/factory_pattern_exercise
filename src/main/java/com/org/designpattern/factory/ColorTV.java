package com.org.designpattern.factory;

/**
 * Created by Administrator on 2019/3/9.
 */
public class ColorTV implements IProduction {
    @Override
    public String getName() {
        String colorTV = "我是彩电";
        System.out.println(colorTV);
        return colorTV;
    }
}
