package com.company.pattern.facade;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-06-23 19:23
 * @description:
 **/
public class TheaterLight {

    private static TheaterLight instance = new TheaterLight();

    public static TheaterLight getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("TheaterLight on");
    }

    public void off(){
        System.out.println("TheaterLight off");
    }

    public void play(){
        System.out.println("TheaterLight play");
    }

    public void pause(){
        System.out.println("TheaterLight pause");
    }
}
