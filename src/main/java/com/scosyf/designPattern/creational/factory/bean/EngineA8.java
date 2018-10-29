package com.scosyf.designPattern.creational.factory.bean;

import com.scosyf.designPattern.creational.factory.bean.abst.IEngine;

public class EngineA8 implements IEngine{

    private String name;
    
    public EngineA8(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "EngineA8: " + name;
    }
    
}
