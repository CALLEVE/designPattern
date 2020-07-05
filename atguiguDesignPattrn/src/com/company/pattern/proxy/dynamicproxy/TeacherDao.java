package com.company.pattern.proxy.dynamicproxy;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-07-05 16:15
 * @description:
 **/
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("老师正在授课中");
    }
}
