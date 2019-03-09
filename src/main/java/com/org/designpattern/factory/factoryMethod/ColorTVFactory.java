package com.org.designpattern.factory.factoryMethod;

import com.org.designpattern.factory.ColorTV;
import com.org.designpattern.factory.IProduction;

/**
 * Created by Administrator on 2019/3/9.
 */
public class ColorTVFactory implements IProductionFactory {
    @Override
    public IProduction getProduction() {
        return new ColorTV();
    }
}
