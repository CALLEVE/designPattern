package com.company.pattern.adapter.classadapter;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-06-03 16:00
 * @description: 被适配类
 **/
public class Voltage220V {

    public int output(){
        int src = 220;
        System.out.println("电压"+src+"伏");
        return src;
    }

}
