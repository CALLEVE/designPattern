package com.company.pattern.decorator;

import java.math.BigDecimal;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-06-13 22:32
 * @description: 浓缩咖啡类（一种具体饮料）
 **/
public class Espresso extends Beverage  {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    protected BigDecimal cost() {
        return new BigDecimal("20.00");
    }
}
