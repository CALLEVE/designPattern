package com.company.pattern.decorator;

import java.math.BigDecimal;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-06-13 22:02
 * @description: 所有公共类(饮料)
 **/
public abstract class Beverage {

    protected String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    //在实际的设计模式，更像是接口的设计规则，只定义方法名，具体的方法实现由继承他的子类来完成
    protected abstract BigDecimal cost();

}
