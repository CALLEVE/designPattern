package com.company.principle.singleresponsibility;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-05-25 10:18
 * @description: 单一原则
 **/
public class SingleResponsibility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("汽车");
        vehicle.run("飞机");
        vehicle.run("轮船");

    }
}


class Vehicle {

    public void run(String name){
        System.out.println(name+"run");
    }

}















