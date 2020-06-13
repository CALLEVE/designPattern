package com.company.pattern.adapter.objectadapter;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-06-03 16:06
 * @description: 具体的适配器本身
 **/
public class VoltageAdapter implements IVoltage5V {

    Voltage220V voltage220V = null;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int dest = 0;
        if (null!=voltage220V){
            int src = voltage220V.output();
            System.out.println("使用对象适配器模式");
            dest = src/44;
            System.out.println("经适配器模式调整后，");
        }

        return dest;
    }
}
