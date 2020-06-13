package com.company.pattern.bridge.case1;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-06-04 19:35
 * @description: 电脑
 *  将品牌的抽象特性聚合到电脑中
 **/
public abstract class Computer {

    protected Brand brand;

    public Computer(Brand brand){
        this.brand = brand;
    }

    // 在聚合的Computer类中，即可以添加（或者说必须添加）品牌的方法
    // 同样也可以自己的定义方法
    // 在实现继承关系后，
    public void info(){
        brand.brandInfo();
    }

}
