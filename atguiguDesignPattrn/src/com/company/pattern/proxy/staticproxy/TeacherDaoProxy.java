package com.company.pattern.proxy.staticproxy;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-07-05 13:28
 * @description:
 **/
public class TeacherDaoProxy implements ITeacherDao {

    //引入实现了相同接口的
    private ITeacherDao target;

    //相同的模式，通过构造器注入


    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("开始代理 完成某些操作");
        target.teach();
        System.out.println("代理结束");
    }
}
