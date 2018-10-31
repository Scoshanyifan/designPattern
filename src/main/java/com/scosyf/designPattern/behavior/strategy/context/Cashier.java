package com.scosyf.designPattern.behavior.strategy.context;

import java.math.BigDecimal;

import com.scosyf.designPattern.behavior.strategy.strategy.AbstractLevelSystem;


public class Cashier {

    private AbstractLevelSystem member;
    
    public Cashier(AbstractLevelSystem member) {
        this.member = member;
    }
    
    public void setMember(AbstractLevelSystem member) {
        this.member = member;
    }
    
    public String discount(String originPrice) {
        return discount(Long.valueOf(originPrice) * 100);
    }
    
    public String discount(long originPrice) {
        long newPirce = member.calculatePrice(originPrice);
        return new BigDecimal(newPirce).movePointLeft(2).toString();
    }
}
