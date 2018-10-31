package com.scosyf.designPattern.behavior.template;

public abstract class AbstractBeverageWithHook {

    protected void prepareBeverage() {
        boilWater();
        cook();
        pour();
        if (customerWantsCondiment()) {
            addCondiments();
        } else {
            System.out.println("默认不加调料！");
        }
    }
    
    protected abstract void cook();

    protected abstract void addCondiments();

    protected void boilWater() {
        System.out.println("Step 1: boil water");
    }
    
    protected void pour() {
        System.out.println("Step 3: pour int cup");
    }
    
    //hook method
    protected boolean customerWantsCondiment() {
        return false;
    }
}
