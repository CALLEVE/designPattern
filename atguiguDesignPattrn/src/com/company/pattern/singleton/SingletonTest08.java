package com.company.pattern.singleton;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-05-27 21:36
 * @description: 枚举
 **/
public class SingletonTest08 {
    public static void main(String[] args) {
        SingletonEnum instance = SingletonEnum.INSTANCE;
        SingletonEnum instance1 = SingletonEnum.INSTANCE;
        System.out.println(instance==instance1);
        System.out.println("instance:"+instance.hashCode());
        System.out.println("instance1"+instance1.hashCode());
    }
}



enum SingletonEnum{
    INSTANCE;
    public void sayOK(){
        System.out.println("ok~");
    }
}











