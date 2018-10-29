package com.scosyf.designPattern.creational.factory.bean.abst;

public abstract class AbstructCar {

    protected IEngine engine;
    
    protected ILight light;
    
    protected IWheel wheel;

    public AbstructCar(IEngine engine, ILight light, IWheel wheel) {
        this.engine = engine;
        this.light = light;
        this.wheel = wheel;
    }

    @Override
    public String toString() {
        return " [engine = " + engine + ", light = " + light + ", wheel = " + wheel + "]";
    }

}
