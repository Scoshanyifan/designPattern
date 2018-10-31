package com.scosyf.designPattern.behavior.strategy;

import com.scosyf.designPattern.behavior.strategy.context.Cashier;
import com.scosyf.designPattern.behavior.strategy.strategy.LevelFirstVIP;
import com.scosyf.designPattern.behavior.strategy.strategy.AbstractLevelSystem;
import com.scosyf.designPattern.behavior.strategy.strategy.LevelSuperVIP;

/**
 * 行为模式中的策略
 * 
 * 其用意是针对一组算法，将每一个算法封装到具有共同接口的独立的类中，从而使得它们可以相互替换。
 * 策略模式使得算法可以在不影响到客户端的情况下发生变化。
 * 
 * 避免多重if/else
 *
 */
public class Test {

    public static void main(String[] args) {
        
        AbstractLevelSystem member = new LevelFirstVIP();
        Cashier context = new Cashier(member);
        long oldPrice = 1250;
        String discountPrice = context.discount(oldPrice);
        System.out.println("原价（分）：" + oldPrice + " 折后价（元）：" + discountPrice);
        
        context.setMember(new LevelSuperVIP());
        oldPrice = 1250;
        discountPrice = context.discount(oldPrice);
        System.out.println("原价（分）：" + oldPrice + " 折后价（元）：" + discountPrice);
    }
}
