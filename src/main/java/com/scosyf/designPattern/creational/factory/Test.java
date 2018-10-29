package com.scosyf.designPattern.creational.factory;

import com.scosyf.designPattern.creational.factory.bean.SmallCar;
import com.scosyf.designPattern.creational.factory.bean.abst.IEngine;
import com.scosyf.designPattern.creational.factory.bean.abst.ILight;
import com.scosyf.designPattern.creational.factory.bean.abst.IWheel;

/**
 * 这里只展示抽象工厂模式：产品族 / 产品等级结构
 * 
 * 抽象工厂和普通工厂的区别：涉及到产品族，为了避免兼容问题（因为A8的轮子不能用在X5上）
 * 
 * 职责单一原则：每个工厂负责相应产品
 * 但是，抽象工厂的问题是：如果要加天窗，就需要修改所有的工厂，给所有的工厂都加上制造天窗的方法。
 */
public class Test {

    public static void main(String[] args) {
        //1.工厂直接生产成品：A8
        FactoryA8 factoryA8 = new FactoryA8();
        SmallCar a8 = factoryA8.generateA8("浙A10000");
        
        //2.生产组件自己组装：X5
        ICarFactory factoryX5 = new FactoryX5();
        IWheel X5wheel = factoryX5.createWheel();
        ILight X5light = factoryX5.createLight();
        IEngine X5engine = factoryX5.createEngine();
        SmallCar x5 = new SmallCar("浙B00001", X5wheel, X5light, X5engine);

        System.out.println(a8);
        System.out.println(x5);
        
    }
    
}
