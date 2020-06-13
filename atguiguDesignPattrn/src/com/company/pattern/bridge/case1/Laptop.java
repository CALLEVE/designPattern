package com.company.pattern.bridge.case1;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-06-06 10:12
 * @description:
 **/
public class Laptop extends Computer {

    //因为父类的构造函数中，实现了与Brand的聚合关系
    public Laptop(Brand brand) {
        super(brand);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("笔记本");
    }
}
