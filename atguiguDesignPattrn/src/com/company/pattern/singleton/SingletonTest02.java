package com.company.pattern.singleton;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-05-25 21:56
 * @description: 静态代码块
 **/
public class SingletonTest02 {
    public static void main(String[] args) {
        Singleton02 instance = Singleton02.getInstance();
        Singleton02 instance1 = Singleton02.getInstance();
        System.out.println(instance == instance1);
        System.out.println("instance:"+instance.hashCode());
        System.out.println("instance1:"+instance1.hashCode());
    }
}


class Singleton02 {

    private Singleton02() {

    }

    private static Singleton02 INSTANCE;

    static {
        INSTANCE = new Singleton02();
    }

    public static Singleton02 getInstance() {
        return INSTANCE;
    }
}
