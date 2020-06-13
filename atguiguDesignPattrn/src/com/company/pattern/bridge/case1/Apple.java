package com.company.pattern.bridge.case1;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-06-04 19:52
 * @description:
 **/
public class Apple implements Brand {
    @Override
    public void brandInfo() {
        System.out.println("Apple");
    }
}
