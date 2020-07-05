package com.company.pattern.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-07-05 16:20
 * @description:
 **/
public class ProxyFactory {

    private Object target;

    //通过构造器进行注入
    public ProxyFactory(Object target) {
        this.target = target;
    }

    //根据目标对象生成代理对象
    public Object getInstance(){
        //newProxyInstance(ClassLoader loader,Class<?>[] interfaces ,InvocationHandler h)
        // 1.ClassLoader loader,指定当前目标对象使用的类加载器，获取加载器的方法固定
        // 2.Class<?>[] interfaces,目标对象实现的接口类型，使用泛型确认类型
        // 3.InvocationHandler h,事件处理，执行目标对象的方法时，会触发事件处理方法，
        // 会把当前执行的目标对象方法作为参数传入
        //
        Object instance = Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            //动态获取方法,其实本质目的就是为了绑定
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("jdk代理开始");
                Object invoke = method.invoke(target, args);
                System.out.println("代理成功");
                return invoke;
            }
        });
        return instance;
    }





}
