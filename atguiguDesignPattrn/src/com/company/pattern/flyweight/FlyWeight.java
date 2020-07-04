package com.company.pattern.flyweight;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-07-04 13:50
 * @description:
 **/
public class FlyWeight {

    public static void main(String[] args) {
        //   相当于构建出一个池的概念
        //    public static Integer valueOf(int i) {
        //        if (i >= IntegerCache.low && i <= IntegerCache.high)
        //            return IntegerCache.cache[i + (-IntegerCache.low)];
        //        return new Integer(i);
        //    }

        //1.在valueof 方法中，先判断值是否在IntegerCache中，如果不在，就创建新的Integer
        //2.在valueof方法，使用到享元模式


        Integer integer = Integer.valueOf(127);
        Integer integer1 = new Integer(127);
        Integer integer2 = Integer.valueOf(127);
        Integer integer3 = new Integer(127);
        System.out.println(integer==integer1);
        System.out.println(integer==integer2);
        System.out.println(integer1==integer3);


    }
}
