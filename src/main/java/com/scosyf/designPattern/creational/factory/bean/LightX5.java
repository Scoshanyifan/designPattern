package com.scosyf.designPattern.creational.factory.bean;

import com.scosyf.designPattern.creational.factory.bean.abst.ILight;

public class LightX5 implements ILight{

    private String name;
    
    public LightX5(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "LightX5: " + name;
    }
    
}
