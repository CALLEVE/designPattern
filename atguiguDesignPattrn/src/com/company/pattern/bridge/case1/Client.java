package com.company.pattern.bridge.case1;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-06-06 10:34
 * @description:
 **/
public class Client {
    public static void main(String[] args) {
        Computer computer1 = new Laptop(new XiaoMi());
        computer1.info();
        System.out.println("=======================");
        Computer computer2 = new Laptop(new HuaWei());
        computer2.info();
        System.out.println("=======================");
        Computer computer3 = new Desktop(new XiaoMi());
        computer3.info();
        System.out.println("=======================");
        Computer computer4 = new Desktop(new HuaWei());
        computer4.info();
    }
}
