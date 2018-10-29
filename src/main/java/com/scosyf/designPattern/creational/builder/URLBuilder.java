package com.scosyf.designPattern.creational.builder;

/**
 * 实现类
 *
 * create by Scosyf on 2017年6月15日
 */
public class URLBuilder extends AbstractURLBuilder{

    public URLBuilder(String prefix) {
        super(prefix);
    }
    
    public URLBuilder category(String category){
        this.addParams("category", category);
        return this;
    }
    
    public URLBuilder id(String id){
        this.addParams("id", id);
        return this;
    }
    
    public URLBuilder language(String language){
        this.addParams("language", language);
        return this;
    }

    @Override
    public String build() {
        return this.prefix + this.params;
    }

}
