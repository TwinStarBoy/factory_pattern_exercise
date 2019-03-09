package com.org.designpattern.factory.simpleFactory;

import com.org.designpattern.factory.ColorTV;
import com.org.designpattern.factory.Fridge;
import com.org.designpattern.factory.IProduction;

/**
 * Created by Administrator on 2019/3/9.
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        ProductFactory factory = new ProductFactory();

        IProduction production = factory.getProduction(Fridge.class);
        String bridge = production.getName();


        production = factory.getProduction(ColorTV.class);
        String corlorTV = production.getName();
    }
}
