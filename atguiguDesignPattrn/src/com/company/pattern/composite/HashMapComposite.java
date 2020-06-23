package com.company.pattern.composite;

import com.company.Main;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-06-23 14:02
 * @description:
 **/
public class HashMapComposite {
    public static void main(String[] args) {

        //在Map的实现过程中
        //1.Map就是一个抽象的构建（顶级接口或者抽象类）---》Component
        //2.HashMap是一个中间的构建（Composite），实现/继承了相关方法 put、putall
        //3.Node是HashMap的静态内部类，类似Leaf叶子节点，这里就没有put、putall

        Map<Integer,String> first = new HashMap<>();
        first.put(1,"一级节点");
        Map<Integer,String> second = new HashMap<>();
        second.put(3, "分支1");
        second.put(4, "分支2");
        first.putAll(second);




    }
}













