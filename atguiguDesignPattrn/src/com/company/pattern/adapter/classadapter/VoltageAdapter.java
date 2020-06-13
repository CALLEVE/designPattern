package com.company.pattern.adapter.classadapter;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-06-03 16:06
 * @description: 具体的适配器本身
 **/
public class VoltageAdapter  extends Voltage220V implements IVoltage5V{
    @Override
    public int output5V() {
        int output = output();
        int dstv = output/44;
        return dstv;
    }
}
