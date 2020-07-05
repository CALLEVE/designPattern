package com.company.pattern.proxy.staticproxy;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-07-05 14:27
 * @description:
 **/
public class Client {
    public static void main(String[] args) {
        //创建目标对象
        TeacherDao teacherDao = new TeacherDao();
        //创建代理对象，同时将被代理对象传递
        TeacherDaoProxy daoProxy = new TeacherDaoProxy(teacherDao);
        daoProxy.teach();

    }
}
