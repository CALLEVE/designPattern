package com.company.pattern.adapter.interfaceadapter;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-06-04 12:31
 * @description:
 **/
public class Client {
    public static void main(String[] args) {
        //可以改造为方法引用
       InterfaceAdapter interfaceAdapter = new InterfaceAdapter() {
           @Override
           public void m1() {
               System.out.println("实现具体的M1");
           }
       };
       interfaceAdapter.m1();

    }
}
