package com.company.pattern.facade;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-06-23 19:23
 * @description:
 **/
public class Screen {

    private static Screen instance = new Screen();

    public static Screen getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("Screen on");
    }

    public void off(){
        System.out.println("Screen off");
    }

    public void play(){
        System.out.println("Screen play");
    }

    public void pause(){
        System.out.println("Screen pause");
    }

}
