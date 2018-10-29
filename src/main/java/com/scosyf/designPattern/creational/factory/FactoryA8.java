package com.scosyf.designPattern.creational.factory;

import com.scosyf.designPattern.creational.factory.bean.EngineA8;
import com.scosyf.designPattern.creational.factory.bean.LightA8;
import com.scosyf.designPattern.creational.factory.bean.SmallCar;
import com.scosyf.designPattern.creational.factory.bean.WheelGeneral;
import com.scosyf.designPattern.creational.factory.bean.abst.IEngine;
import com.scosyf.designPattern.creational.factory.bean.abst.ILight;
import com.scosyf.designPattern.creational.factory.bean.abst.IWheel;

public class FactoryA8 implements ICarFactory{

    @Override
    public IEngine createEngine() {
        return new EngineA8("A8引擎");
    }

    @Override
    public ILight createLight() {
        return new LightA8("A8大灯");
    }

    @Override
    public IWheel createWheel() {
        return new WheelGeneral("通用轮胎");
    }
    
    public SmallCar generateA8(String plate) {
        return new SmallCar(plate, createWheel(), createLight(), createEngine());
    }
}
