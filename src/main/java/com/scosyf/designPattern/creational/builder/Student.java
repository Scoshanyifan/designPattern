package com.scosyf.designPattern.creational.builder;

public class Student {
    private String name;
    private String sex;
    private String addr;
    private String phone;
    //对外封闭
    private Student(String name, String sex, String addr, String phone) {
        this.name = name;
        this.sex = sex;
        this.addr = addr;
        this.phone = phone;
    }
    
    /**
     * 这里用因为静态方法，所以需要静态内部类
     */
    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String name;
        private String sex;
        private String addr;
        private String phone;
        //对外封闭
        private Builder() {}
        
        public Builder name(String name) {
            this.name = name;
            return this;
        }
        
        public Builder sex(String sex) {
            this.sex = sex;
            return this;
        }
        
        public Builder addr(String addr) {
            this.addr = addr;
            return this;
        }
        
        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }
        
        // 利用内部类可以访问外部类属性或方法
        public Student build() {
            // TODO 这里可以做一些校验工作
            return new Student(name, sex, addr, phone);
        }
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", sex=" + sex + ", addr=" + addr + ", phone=" + phone + "]";
    }
}
