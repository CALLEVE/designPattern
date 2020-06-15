package com.company.pattern.decorator;

import java.math.BigDecimal;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-06-13 22:54
 * @description: 豆浆调料类（继承自CondimentDecorator
 **/
public class SoyDecorator extends CondimentDecorator {

    Beverage beverage;

    public SoyDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",Decorator";
    }

    @Override
    protected BigDecimal cost() {
        return new BigDecimal("2.00").add(beverage.cost());
    }
}
