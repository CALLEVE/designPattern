package com.company.pattern.composite;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-06-23 13:16
 * @description: Client
 **/
public class Client {
    public static void main(String[] args) {

        //创建学校
        OrganizationComponent university = new University("清华大学","中国顶级大学");

        //创建学院
        OrganizationComponent computerCollege = new College("计算机学院", "计算机学院");
        OrganizationComponent infoCollege = new College("信息工程学院", "信息工程学院");

        //计算机学院学院下的专业（系）
        computerCollege.add(new Department("软件工程", "软件工程不错"));
        computerCollege.add(new Department("网络工程", "网络工程不错"));
        computerCollege.add(new Department("计算机科学与技术", "计算机科学与技术不错"));

        //计算机学院学院下的专业（系）
        infoCollege.add(new Department("信息工程", "信息工程不好学"));
        infoCollege.add(new Department("通信工程", "通信工程不错"));

        //最后将学院加入到学校中
        university.add(computerCollege);
        university.add(infoCollege);

        //依据需要打印输出，某一节点向下的所有内容
        //university.print();

        //打印学院
        computerCollege.print();


    }
}




















