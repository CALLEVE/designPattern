package com.company.pattern.facade;

import java.nio.file.ProviderNotFoundException;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-06-23 19:38
 * @description: 对于外部使用者而言，只需要关心并且只使用该类即可实现需要和制指定的功能
 *                  所以需要将其他类聚合到
 **/
public class HomeTheaterFacade {

    //最常用的方式是聚合
    //

    private DVDPlayer dvdPlayer;
    private Popcorn popcorn;
    private Projector projector;
    private Screen screen;
    private Stereo stereo;
    private TheaterLight theaterLight;

    public HomeTheaterFacade() {
        super();
        this.dvdPlayer = DVDPlayer.getInstance();
        this.popcorn = Popcorn.getInstance();
        this.projector = Projector.getInstance();
        this.screen = Screen.getInstance();
        this.stereo = Stereo.getInstance();
        this.theaterLight = TheaterLight.getInstance();
    }

    //然后通过定义具体方法实现
    public void ready(){
        dvdPlayer.on();
        popcorn.on();
        projector.on();
    }

    public void play(){
        dvdPlayer.play();
    }

    public void pause(){
        dvdPlayer.pause();
    }

    public void end(){
        popcorn.off();
        projector.off();
    }

}
