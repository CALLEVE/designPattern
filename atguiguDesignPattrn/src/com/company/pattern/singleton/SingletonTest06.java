package com.company.pattern.singleton;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-05-27 15:43
 * @description: 双重检查
 **/
public class SingletonTest06 {

    private SingletonTest06(){}

    private static volatile SingletonTest06 INSTANCE;

    public static SingletonTest06 getInstance(){
        if(INSTANCE ==null){
            synchronized (SingletonTest06.class){
                if(INSTANCE ==null){
                    INSTANCE = new SingletonTest06();
                }
            }
        }
        return INSTANCE;
    }






}
