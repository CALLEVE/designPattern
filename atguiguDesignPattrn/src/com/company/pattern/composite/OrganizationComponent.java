package com.company.pattern.composite;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-06-22 16:11
 * @description: OrganizationComponent
 **/
public abstract class OrganizationComponent {

    //名字
    private String name;

    //说明
    private String des;

    //为什么不设置为抽象，对于某些叶子没有后续的实现，故不要在继续具体方法的实现
    protected void add(OrganizationComponent organizationComponent){
        //默认实现
        throw new UnsupportedOperationException();
    }

    protected void remove(OrganizationComponent organizationComponent){
        //默认实现
        throw new UnsupportedOperationException();
    }

    //print 子类均需要实现
    protected abstract void print();

    public OrganizationComponent(String name, String des) {
        this.name = name;
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
























