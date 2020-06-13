package com.company.pattern.builder.improve;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-06-02 22:03
 * @description: 普楼的建设
 **/
public class CommenHouseBuilder extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("普通房子的基础设施");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子的墙体");
    }

    @Override
    public void rootfed() {
        System.out.println("普通房子的屋顶");
    }
}
