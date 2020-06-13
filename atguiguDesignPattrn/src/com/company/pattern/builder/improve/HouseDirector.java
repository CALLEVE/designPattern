package com.company.pattern.builder.improve;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-06-03 13:45
 * @description: 房子指导者 --》根据需要来调用房子建设者来建造房子
 **/
public class HouseDirector {
    HouseBuilder houseBuilder = null;

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public HouseBuilder getHouseBuilder() {
        return houseBuilder;
    }

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House builderHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.rootfed();
        return houseBuilder.buildHouse();
    }


}
