package com.scosyf.designPattern.behavior.strategy.strategy;


public class LevelFirstVIP implements AbstractLevelSystem{

    @Override
    public long calculatePrice(long originPrice) {
        return (long) (originPrice * 0.95);
    }

}
