package com.scosyf.designPattern.creational.factory.bean;

import com.scosyf.designPattern.creational.factory.bean.abst.IWheel;

public class WheelGeneral implements IWheel{

    private String name;
    
    public WheelGeneral(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "WheelGeneral: " + name;
    }
    
}
