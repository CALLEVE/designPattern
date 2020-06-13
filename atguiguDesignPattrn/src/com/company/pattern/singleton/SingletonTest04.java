package com.company.pattern.singleton;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-05-27 11:36
 * @description: 懒汉式线程安全
 **/
public class SingletonTest04 {

    private SingletonTest04(){}

    private static SingletonTest04 INSTACNE;

    // synchronized 对方加锁
    public static synchronized SingletonTest04 getInstance(){
        if (INSTACNE==null){
            INSTACNE = new SingletonTest04();
        }
        return INSTACNE;

    }


    public static void main(String[] args) {
        SingletonTest04 instance = SingletonTest04.getInstance();
        SingletonTest04 instance1 = SingletonTest04.getInstance();
        System.out.println(instance==instance1);

    }
}
