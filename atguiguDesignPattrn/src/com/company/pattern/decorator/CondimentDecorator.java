package com.company.pattern.decorator;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-06-13 22:33
 * @description: 调料装饰着抽象类（继承自饮料抽象类）
 **/
public abstract class CondimentDecorator extends Beverage {
    //所有调料必须重新实现 getDescription，这个getDescription是针对调料而言的Description
    //作为所有装饰者的顶尖父类，必须在父类中定义
    public abstract String getDescription();

}
