package com.scosyf.designPattern.behavior.template;

public class CoffeeWithHook extends AbstractBeverageWithHook{
    
    private boolean ifAddCondiments;
    
    public void setIfAddCondiments(boolean ifAddCondiments) {
        this.ifAddCondiments = ifAddCondiments;
    }

    @Override
    protected void cook() {
        System.out.println("Step 2: cook [coffee]");
    }

    @Override
    protected void addCondiments() {
        System.out.println("finally: add some sugar and milk");
    }

    @Override
    protected boolean customerWantsCondiment() {
        return ifAddCondiments;
    }
    
}
