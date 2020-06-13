package com.company.pattern.adapter.objectadapter;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-06-03 16:09
 * @description: 实际使用者
 **/
public class Phone {

    public String charging(IVoltage5V i){
        if (5==i.output5V()){
            System.out.println("5V 可以使用");
        }else{
            System.out.println("非5V 不能使用");
        }
        return "";
    }

}
