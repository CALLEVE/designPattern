package com.company.pattern.proxy.cglib;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-07-05 20:35
 * @description:
 **/
public class Client {
    public static void main(String[] args) {
        TeacherDao teacherDao = new TeacherDao();
        TeacherDao instance = (TeacherDao)new ProxyFactory(teacherDao).getProxyInstance();
        // 执行代理对象的方法，触发intecept方法，从而实现对象的调用
        instance.teach();



    }
}
