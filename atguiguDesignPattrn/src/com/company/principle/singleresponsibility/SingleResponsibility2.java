package com.company.principle.singleresponsibility;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-05-25 14:15
 * @description: SingleResponsibility2
 **/
public class SingleResponsibility2 {
    public static void main(String[] args) {
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");

        WaterVehicle waterVehicle = new WaterVehicle();
        waterVehicle.run("轮船");

        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("汽车");

    }

}

class AirVehicle{
    public void run(String name){
        System.out.println("air:"+name);
    }
}

class WaterVehicle{
    public void run(String name){
        System.out.println("water:"+name);
    }
}

class RoadVehicle{
    public void run(String name){
        System.out.println("road:"+name);
    }
}


