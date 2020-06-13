package com.company.pattern.adapter.objectadapter;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-06-03 16:19
 * @description: 测试
 **/
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        //这里调用需要传入具体的 adapter类
        phone.charging(new VoltageAdapter(new Voltage220V()));
    }
}
