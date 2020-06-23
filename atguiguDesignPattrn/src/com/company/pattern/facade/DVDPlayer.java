package com.company.pattern.facade;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-06-23 17:02
 * @description: DVDPlayer  均使用单例对象
 **/
public class DVDPlayer {

    private static DVDPlayer instance = new DVDPlayer();

    public DVDPlayer getInstance(){
        return  instance;
    }

    public void on(){
        System.out.println("dvd on");
    }

    public void off(){
        System.out.println("dvd off");
    }

    public void play(){
        System.out.println("dvd play");
    }

    public void pause(){
        System.out.println("dvd pause");
    }


}
