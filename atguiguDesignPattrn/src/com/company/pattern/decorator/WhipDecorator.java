package com.company.pattern.decorator;

import java.math.BigDecimal;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-06-13 22:58
 * @description: 奶泡调料类（继承自CondimentDecorator
 **/
public class WhipDecorator extends CondimentDecorator{

    Beverage beverage;

    public WhipDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",Whip";
    }

    @Override
    protected BigDecimal cost() {
        return new BigDecimal("3.00").add(beverage.cost());
    }
}
