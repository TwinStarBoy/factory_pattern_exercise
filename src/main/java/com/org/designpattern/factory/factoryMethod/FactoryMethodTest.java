package com.org.designpattern.factory.factoryMethod;

import com.org.designpattern.factory.IProduction;

/**
 * Created by Administrator on 2019/3/9.
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        IProductionFactory productionFactory = new ColorTVFactory();
        IProduction production = productionFactory.getProduction();
        production.getName();

        productionFactory = new FridgeFactory();
        production = productionFactory.getProduction();
        production.getName();
    }
}
