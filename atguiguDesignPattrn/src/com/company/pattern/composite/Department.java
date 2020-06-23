package com.company.pattern.composite;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-06-22 16:55
 * @description: Department是最小的叶子节点
 **/
public class Department extends OrganizationComponent {

    public Department(String name, String des) {
        super(name, des);
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    public void setDes(String des) {
        super.setDes(des);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }


    //从组织结构的层次分级来看，Department属于叶子节点，即最低一级节点，后续无需add和remove
    //打印自己即可
    @Override
    protected void print() {
        System.out.println(this.getName());
    }

}
