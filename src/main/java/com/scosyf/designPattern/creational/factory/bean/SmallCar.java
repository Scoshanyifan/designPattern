package com.scosyf.designPattern.creational.factory.bean;

import com.scosyf.designPattern.creational.factory.bean.abst.AbstructCar;
import com.scosyf.designPattern.creational.factory.bean.abst.IEngine;
import com.scosyf.designPattern.creational.factory.bean.abst.ILight;
import com.scosyf.designPattern.creational.factory.bean.abst.IWheel;

public class SmallCar extends AbstructCar{
    
    private String plate;
    
    public SmallCar(String plate, IWheel wheel, ILight light, IEngine engine) {
        super(engine, light, wheel);
        this.plate = plate;
    }

    @Override
    public String toString() {
        return "Car [plate=" + plate + "] >>> " + super.toString();
    }
    
}
