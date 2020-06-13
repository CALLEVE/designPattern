package com.company.pattern.builder.improve;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-06-02 21:52
 * @description: House作为一个产品，具有产品的属性,所以产品里封装属性
 **/
public class House {
    private String basic;
    private String wall;
    private String rootfed;

    public String getBasic() {
        return basic;
    }

    public void setBasic(String basic) {
        this.basic = basic;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getRootfed() {
        return rootfed;
    }

    public void setRootfed(String rootfed) {
        this.rootfed = rootfed;
    }

}
