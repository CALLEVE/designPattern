package com.company.pattern.bridge.case1;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-06-06 10:12
 * @description: 桌面
 **/
public class Desktop extends Computer{

    public Desktop(Brand brand) {
        super(brand);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("台式机");
    }
}
