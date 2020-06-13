package com.company.pattern.prototype;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-05-31 14:50
 * @description: Clinet
 **/
public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep();
        sheep.id = 1;
        sheep.name = "多里";
        sheep.color = "black";

        Sheep sheep1 = new Sheep(sheep.getId(),sheep.name,sheep.getColor());
        System.out.println(sheep+""+System.identityHashCode(sheep));
        System.out.println(sheep1+""+System.identityHashCode(sheep1));
        
    }
}
