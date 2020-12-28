package com.company.pattern.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-05-27 15:43
 * @description: 双重检查
 **/
public class SingletonTest06 {

    private static boolean qinjiang = false;

    private SingletonTest06(){
        // 这一步加锁，感觉性能会不好
        synchronized (SingletonTest06.class){
            if (qinjiang==false){
                qinjiang = true;
            }else{
                throw new RuntimeException("不要使用反射破坏单例");
            }
        }
    }

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

    public static void main(String[] args) throws Exception {
        SingletonTest06 instance1 = SingletonTest06.getInstance();

        SingletonTest06 instance2 = SingletonTest06.getInstance();

//        Constructor<SingletonTest06> declaredConstructor = SingletonTest06.class.getDeclaredConstructor(null);
//        declaredConstructor.setAccessible(true);
//        SingletonTest06 instance1 = declaredConstructor.newInstance();
//        SingletonTest06 instance2 = declaredConstructor.newInstance();

//        if (instance1==instance2){
//            System.out.println("yes");
//        }else{
//            System.out.println("no");
//        }
//        System.out.println(instance1);
//        System.out.println(instance2);
    }
}
