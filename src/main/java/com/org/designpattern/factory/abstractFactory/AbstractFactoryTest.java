package com.org.designpattern.factory.abstractFactory;

/**
 * Created by Administrator on 2019/3/9.
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        IProductionFactory productionFactory = new FridgeFactory();
        productionFactory.getName().printName();
        productionFactory.getFunction().printFunction();
        System.out.println("==========================================");
        productionFactory = new ColorTVFactory();
        productionFactory.getName().printName();
        productionFactory.getFunction().printFunction();
    }
}
