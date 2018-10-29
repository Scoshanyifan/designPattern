package com.scosyf.designPattern.creational.singleton;

/**
 * 饿汉模式：希望要用的时候直接就能取到
 * 
 * 原理：通过static的静态初始化创建私有实例，在该类第一次被加载的时候创建
 * 
 * 作用：由于该实例在类被加载的时候就创建出来了，所以也避免了线程安全问题
 * 
 * 问题：1.还未用到就被创建，浪费资源
 *      2.如果这个类被多次加载，就会有多个实例（TODO 什么情况会多次加载 ）
 */
public class HungryType {

    //以下两种方式原理一样
    private static HungryType instance = new HungryType();
    
//    private static HungryType instance;
//    static {
//        instance = new HungryType();
//    }
    
    private HungryType() {}
    
    public static HungryType getInstance() {
        return instance;
    }
    
}
