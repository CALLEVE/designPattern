package com.company.pattern.builder.improve;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-06-02 22:03
 * @description: 高楼的建设
 **/
public class HighHouseBuilder extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println("高楼的基础");
    }

    @Override
    public void buildWalls() {
        System.out.println("高楼的墙体");
    }

    @Override
    public void rootfed() {
        System.out.println("高楼的屋顶");
    }
}
