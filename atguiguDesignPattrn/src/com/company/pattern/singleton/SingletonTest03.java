package com.company.pattern.singleton;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-05-25 22:09
 * @description: 懒汉式线程不安全
 **/
public class SingletonTest03 {
    public static void main(String[] args) {
        Singleton03 instance = Singleton03.getInstance();
        Singleton03 instance1 = Singleton03.getInstance();
        System.out.println(instance == instance1);
        System.out.println("instance:" + instance.hashCode());
        System.out.println("instance1:" + instance1.hashCode());

        //可验证多线程问题
        for(int i=0;i<10;i++){
            new Thread(()->{
                Singleton03.getInstance();
            }).start();

        }


    }
}


class Singleton03 {

    private Singleton03() {
        System.out.println(Thread.currentThread().getName()+"11");
    }

    private static Singleton03 instance;

    public static Singleton03 getInstance() {
        if (instance == null) {
            instance = new Singleton03();
        }
        return instance;
    }
}