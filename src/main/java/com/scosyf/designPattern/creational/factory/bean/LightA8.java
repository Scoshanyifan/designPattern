package com.scosyf.designPattern.creational.factory.bean;

import com.scosyf.designPattern.creational.factory.bean.abst.ILight;

public class LightA8 implements ILight{

    private String name;
    
    public LightA8(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "LightA8: " + name;
    }
    
}
