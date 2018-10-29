package com.scosyf.designPattern.creational.factory;

import com.scosyf.designPattern.creational.factory.bean.EngineX5;
import com.scosyf.designPattern.creational.factory.bean.LightX5;
import com.scosyf.designPattern.creational.factory.bean.WheelGeneral;
import com.scosyf.designPattern.creational.factory.bean.abst.IEngine;
import com.scosyf.designPattern.creational.factory.bean.abst.ILight;
import com.scosyf.designPattern.creational.factory.bean.abst.IWheel;

public class FactoryX5 implements ICarFactory{

    @Override
    public IEngine createEngine() {
        return new EngineX5("X5引擎");
    }

    @Override
    public ILight createLight() {
        return new LightX5("X5大灯");
    }

    @Override
    public IWheel createWheel() {
        return new WheelGeneral("通用轮胎");
    }

}
