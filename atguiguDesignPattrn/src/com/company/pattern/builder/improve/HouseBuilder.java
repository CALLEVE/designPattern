package com.company.pattern.builder.improve;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-06-02 21:57
 * @description: Builder 封装行为或者方法
 **/
public abstract class HouseBuilder {

    protected House house = new House();
    //将产品对应的零件（部件）的生产方法进行提取
    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void rootfed();

    //建造房子好，将产品（房子）返回
    public House buildHouse(){
        return house;
    }

}
