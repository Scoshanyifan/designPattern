package com.scosyf.designPattern.creational.factory.bean;

import com.scosyf.designPattern.creational.factory.bean.abst.IEngine;

public class EngineX5 implements IEngine{
    
    private String name;
    
    public EngineX5(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "EngineX5: " + name;
    }
    
}
