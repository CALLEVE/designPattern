package com.company.pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-06-22 16:55
 * @description:
 **/
public class College extends OrganizationComponent {

    //如果在父类的体系中已有构造函数
    //在继承关系下的的子类中必须通过后遭函数实现父类中的构造函数
    List<OrganizationComponent> organizationComponents = new ArrayList<>();

    public College(String name, String des) {
        super(name, des);
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }

    /*
     * @Author: wangjinpeng
     * @Date: 2020/6/22 17:03
     * @Param: []
     * @return: void
     * @Description:遍历输出学院所包含的院系
     */
    @Override
    protected void print() {
        System.out.println("---"+this.getName()+"---");
        //此处的organizationComponent对象代表的是 学院
        for (OrganizationComponent organizationComponent : organizationComponents){
            organizationComponent.print();
        }

    }
}
