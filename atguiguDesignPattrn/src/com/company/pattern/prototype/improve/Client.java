package com.company.pattern.prototype.improve;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-06-01 15:38
 * @description: 测试
 **/
public class Client {
    public static void main(String[] args) throws Exception {
        Sheep sheep = new Sheep(55, "55", "black");
        Sheep clone = (Sheep)sheep.clone();
        System.out.println(sheep+""+System.identityHashCode(sheep));
        System.out.println(clone+""+System.identityHashCode(clone));
    }
}
