package com.company.pattern.facade;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-06-23 19:23
 * @description:
 **/
public class Stereo {

    private static Stereo instance = new Stereo();

    public static Stereo getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("Stereo on");
    }

    public void off(){
        System.out.println("Stereo off");
    }

    public void play(){
        System.out.println("Stereo play");
    }

    public void pause(){
        System.out.println("Stereo pause");
    }

}
