package com.company.pattern.prototype.improve;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-06-01 15:38
 * @description: Sheep
 **/
public class Sheep implements Cloneable {

    public Integer id;
    public String name;
    public String color;

    public Sheep(Integer id, String name, String color) {
        this.id = id;
        this.name = name;
        this.color = color;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Sheep sheep = null;
        sheep = (Sheep) super.clone();
        return sheep;
    }
}
