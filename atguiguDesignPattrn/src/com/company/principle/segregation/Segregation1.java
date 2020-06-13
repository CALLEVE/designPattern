package com.company.principle.segregation;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-05-25 15:30
 * @description: 接口隔离
 **/
public class Segregation1 {




}

interface interface1{
    void operation1();
    void operation2();
    void operation3();
    void operation4();
    void operation5();
}

class C implements interface1{
    @Override
    public void operation1() {
        System.out.println(" C 实现了 operation1");
    }

    @Override
    public void operation2() {
        System.out.println(" C 实现了 operation2");
    }

    @Override
    public void operation3() {
        System.out.println(" C 实现了 operation3");
    }

    @Override
    public void operation4() {
        System.out.println(" C 实现了 operation4");
    }

    @Override
    public void operation5() {
        System.out.println(" C 实现了 operation5");
    }
}



class D implements interface1{
    @Override
    public void operation1() {
        System.out.println(" C 实现了 operation1");
    }

    @Override
    public void operation2() {
        System.out.println(" C 实现了 operation2");
    }

    @Override
    public void operation3() {
        System.out.println(" C 实现了 operation3");
    }

    @Override
    public void operation4() {
        System.out.println(" C 实现了 operation4");
    }

    @Override
    public void operation5() {
        System.out.println(" C 实现了 operation5");
    }
}

class A{
    public void denpend3(interface1 interface1){
        interface1.operation3();
    }

    public void denpend4(interface1 interface1){
        interface1.operation4();
    }

    public void denpend5(interface1 interface1){
        interface1.operation5();
    }

}

class B{
    public void denpend1(interface1 interface1){
        interface1.operation1();
    }

    public void denpend2(interface1 interface1){
        interface1.operation2();
    }

    public void denpend3(interface1 interface1){
        interface1.operation3();
    }

}





