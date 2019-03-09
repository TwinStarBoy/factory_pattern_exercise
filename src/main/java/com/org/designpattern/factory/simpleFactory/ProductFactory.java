package com.org.designpattern.factory.simpleFactory;


import com.org.designpattern.factory.IProduction;

/**
 * Created by Administrator on 2019/3/9.
 */
public class ProductFactory {

    public IProduction getProduction(Class<? extends IProduction> clazz){
        try {
            IProduction production = clazz.newInstance();
            return production;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return null;
    }
}
