package com.company.pattern.builder.improve;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-06-03 13:52
 * @description: Client
 **/
public class Client {
    public static void main(String[] args) {
        HouseDirector houseDirector = new HouseDirector(new CommenHouseBuilder());
        House house = houseDirector.builderHouse();

        System.out.println("----------------");
        HouseDirector houseDirector1 = new HouseDirector(new HighHouseBuilder());
        House house1 = houseDirector1.builderHouse();


    }
}
