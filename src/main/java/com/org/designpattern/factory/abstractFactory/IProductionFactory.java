package com.org.designpattern.factory.abstractFactory;

/**
 * Created by Administrator on 2019/3/9.
 */
public interface IProductionFactory {
    IFunction getFunction();
    IName getName();
}
