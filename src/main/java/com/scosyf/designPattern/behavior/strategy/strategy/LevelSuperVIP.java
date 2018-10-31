package com.scosyf.designPattern.behavior.strategy.strategy;


public class LevelSuperVIP implements AbstractLevelSystem{

    @Override
    public long calculatePrice(long originProce) {
        return (long) (originProce * 0.7);
    }

}
