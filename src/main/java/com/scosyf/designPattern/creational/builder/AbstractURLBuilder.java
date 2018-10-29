package com.scosyf.designPattern.creational.builder;

public abstract class AbstractURLBuilder {

    protected StringBuilder params = new StringBuilder();
    
    protected String prefix;
    
    /**
     * 设置URL前缀
     * @param prefix
     */
    public AbstractURLBuilder(String prefix) {
        this.prefix = prefix;
    }

    /**
     * 添加参数
     * @param name
     * @param value
     */
    protected void addParams(String name, String value){
        if (name == null || value == null) {
            return;
        }
        //第一个参数
        if (params.length() == 0) {
            params.append(name).append("=").append(value);
        } else {
          params.append("&").append(name).append("=").append(value);  
        }
    }
    
    /**
     * 生成最后的URL地址
     * @return
     */
    public abstract String build();
    
}
