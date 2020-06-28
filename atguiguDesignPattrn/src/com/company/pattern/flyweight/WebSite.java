package com.company.pattern.flyweight;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-06-24 15:32
 * @description: 定义为抽象父类
 * 从某种程度上看，抽象父类中定义抽象方法，与接口整体的实现效果是一样的
 **/
public abstract class WebSite {

    public abstract void use(User user);

}
