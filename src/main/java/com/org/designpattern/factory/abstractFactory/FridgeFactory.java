package com.org.designpattern.factory.abstractFactory;

/**
 * Created by Administrator on 2019/3/9.
 */
public class FridgeFactory implements IProductionFactory {
    @Override
    public IName getName() {
        return new FridgeName();
    }

    @Override
    public IFunction getFunction() {
        return new FridgeFunction();
    }
}
