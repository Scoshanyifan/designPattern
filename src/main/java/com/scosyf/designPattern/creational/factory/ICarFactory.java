package com.scosyf.designPattern.creational.factory;

import com.scosyf.designPattern.creational.factory.bean.abst.IEngine;
import com.scosyf.designPattern.creational.factory.bean.abst.ILight;
import com.scosyf.designPattern.creational.factory.bean.abst.IWheel;

/**
 * 工厂接口
 *
 */
public interface ICarFactory {

    IEngine createEngine();
    
    ILight createLight();
    
    IWheel createWheel();
}
