package com.company.principle.singleresponsibility;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-05-25 14:15
 * @description: SingleResponsibility3
 **/
public class SingleResponsibility3 {
    public static void main(String[] args) {
        VehicleClass vehicleClass = new VehicleClass();
        vehicleClass.airRun("飞机");
        vehicleClass.roadRun("汽车");
        vehicleClass.waterRun("");
    }

}

class VehicleClass {

    public void airRun(String name){
        System.out.println("air:run"+name);
    }

    public void roadRun(String name){
        System.out.println("road:run"+name);
    }

    public void waterRun(String name){
        System.out.println("water:run"+name);
    }
}
