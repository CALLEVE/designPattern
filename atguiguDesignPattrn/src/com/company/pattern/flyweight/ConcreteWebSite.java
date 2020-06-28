package com.company.pattern.flyweight;

public class ConcreteWebSite extends WebSite {

    //共享的部分，内部的状态
    private String type = "";

    //构造器
    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站的发布形式"+type+"网站使用者"+user.getName());
    }

}









