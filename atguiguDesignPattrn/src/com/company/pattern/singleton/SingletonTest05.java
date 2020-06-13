package com.company.pattern.singleton;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-05-27 15:30
 * @description: 懒汉式、线程安全、同步代码块
 **/
public class SingletonTest05 {
    private SingletonTest05(){}

    private static SingletonTest05 INSTANCE;

    private static SingletonTest05 getInstance(){
        if (INSTANCE == null){
            //同步代码块
            synchronized (SingletonTest05.class){
                INSTANCE = new SingletonTest05();
            }
        }
        return INSTANCE;
    }





}
