package com.scosyf.designPattern.creational.builder;

/**
 * Builder模式适用于构建多个参数的场景，相比于new，然后set赋值的形式，可读性更强(还有安全问题)
 * 这里展示2种方式：一个继承，一个内部类
 *
 * create by Scosyf on 2017年6月15日
 */
public class Test {

    public static void main(String[] args) {

        /** 继承 */
        String prefixURL = "http://localhost:8080/params?";
        String url = new URLBuilder(prefixURL).category("article").id("628").language("EN_cn").build();
        System.out.println("URL: " + url);
        
        /** 内部类 */
        Student student = Student.builder().name("Tom").sex("男").addr("HangZhou").phone("18806718753").build();
        System.out.println(student);
    }

}
