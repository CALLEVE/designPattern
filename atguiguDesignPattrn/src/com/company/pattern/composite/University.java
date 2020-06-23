package com.company.pattern.composite;


import java.util.ArrayList;
import java.util.List;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-06-22 16:55
 * @description: 大学
 **/
public class University extends OrganizationComponent {

    List<OrganizationComponent> organizationComponents = new ArrayList<>();

    public University(String name, String des) {
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
     * @Description:遍历输出大学所包含的学院
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
