package com.company.pattern.singleton;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-05-25 21:26
 * @description: 静态变类
 **/
public class SingletonTest01 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance==instance1);

        System.out.println(instance+":"+instance.hashCode());
        System.out.println(instance1+":"+instance1.hashCode());
    }
}

//饿汉式（静态变量）
class Singleton{

    //私有化构造函数
    private Singleton(){

    }

    //设置静态对象
    private static final Singleton INSTANCE  = new Singleton();

    // 提供对外的使用方法
    public static Singleton getInstance(){
        return INSTANCE;
    }


}










