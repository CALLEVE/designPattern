package com.company.pattern.decorator;

import java.math.BigDecimal;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-06-13 22:43
 * @description: 摩卡调料类（继承自CondimentDecorator）
 **/
public class MochaDecorator extends CondimentDecorator {

    // 为了实现装饰者的特点，以及功能通过聚合的方式引入饮料的顶尖父类
    Beverage beverage;

    //通过利用构造函数
    public MochaDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",Mocha";
    }

    @Override
    protected BigDecimal cost() {
        return new BigDecimal(1.00).add(beverage.cost());
    }
}
