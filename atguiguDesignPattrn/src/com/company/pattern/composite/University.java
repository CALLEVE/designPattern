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

    public University(String name, String des, ) {
        super(name, des);
    }

    //


    @Override
    protected void add(OrganizationComponent organizationComponent) {
        super.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        super.remove(organizationComponent);
    }

    /*
     * @Author: wangjinpeng
     * @Date: 2020/6/22 17:03
     * @Param: []
     * @return: void
     * @Description:输出学院所包含的院系
     */
    @Override
    protected void print() {

    }
}
