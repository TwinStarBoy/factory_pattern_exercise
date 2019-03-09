package com.org.designpattern.factory.abstractFactory;

/**
 * Created by Administrator on 2019/3/9.
 */
public class ColorTVFactory implements IProductionFactory {
    @Override
    public IName getName() {
        return new ColorTVName();
    }

    @Override
    public IFunction getFunction() {
        return new ColorTVFunction();
    }
}
