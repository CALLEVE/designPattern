package com.company.pattern.singleton;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-05-27 16:34
 * @description: 静态内部类
 **/
public class SingletonTest07 {

    private SingletonTest07(){}

    private static class SingletonInnerClass{
        private static final SingletonTest07 INSTANCE = new SingletonTest07();
    }

    public static SingletonTest07 getInstance(){
        return SingletonInnerClass.INSTANCE;
    }


}
