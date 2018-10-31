package com.scosyf.designPattern.behavior.template;

/**
 * 模板方法模式 & 钩子Hook方法
 * 
 * 模板方法，定义执行步骤，具体实现由子类来
 * 
 * 声明在抽象类中的方法，只有空的或默认的实现，通常应用在模板设计模式中，
 * 让子类可以对算法的不同点进行选择或挂钩，要不要挂钩由子类决定。
 *
 */
public class Test {

    public static void main(String[] args) {
        
        CoffeeWithHook coffee = new CoffeeWithHook();
        coffee.setIfAddCondiments(true);
        coffee.prepareBeverage();
    }
    
}
