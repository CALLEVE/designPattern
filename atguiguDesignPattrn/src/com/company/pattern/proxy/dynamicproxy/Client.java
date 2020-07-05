package com.company.pattern.proxy.dynamicproxy;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-07-05 17:01
 * @description:
 **/
public class Client {
    public static void main(String[] args) {

        //创建目标对象，只需要获取目标对象的属性作为参数传入
        TeacherDao teacherDao = new TeacherDao();

        //通过代理工厂获取代理对象
        ITeacherDao proxyFactory = (ITeacherDao)new ProxyFactory(teacherDao).getInstance();
        //System.out.println("proxyFactory:"+proxyFactory);
        proxyFactory.teach();
//        System.out.println("Class:"+proxyFactory.getClass());
    }
}
