package com.company.pattern.factory.simplefactory.pizzastore.order;

import com.company.pattern.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.company.pattern.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.company.pattern.factory.simplefactory.pizzastore.pizza.Pizza;
import com.company.pattern.factory.simplefactory.pizzastore.simplefactory.SimpleFactory;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-05-28 19:53
 * @description: OrderPizza  类似一个中间人的操作
 **/
public class OrderPizza {

    //构造器
//    public OrderPizza() {
//        Pizza pizza = null;
//        String orderType;
//        do{
//            orderType = getType();
//            if ("greek".equals(orderType)){
//                    pizza = new GreekPizza();
//                    pizza.setName(" Greekpizza");
//            }else if("cheese".equals(orderType)){
//                    pizza = new CheesePizza();
//                    pizza.setName("Cheesepizza");
//            }else{
//                break;
//            }
//            //开始pizza的制作流程
//            pizza.prepare();
//            pizza.bake();
//            pizza.cut();
//            pizza.box();
//        }while (true);
//    }

    public OrderPizza(SimpleFactory simpleFactory){
        //通过该类的构造方法
        setSimpleFactory(simpleFactory);
    }

    //定义一个简单工厂对象
    SimpleFactory simpleFactory;

    //通过该方法 指定工厂类型  及我需要什么工厂产出什么产品
    public void setSimpleFactory(SimpleFactory simpleFactory) {

        String orederType = "";//用户选择的
//        this.simpleFactory = simpleFactory;
        do {
            orederType = getType();
            Pizza pizza = simpleFactory.createPizza(orederType);
            if (pizza !=null){
                    pizza.prepare();
                    pizza.bake();
                    pizza.cut();
                    pizza.box();
            }
            else
            {
                System.out.println("失败");
                break;
            }
        }while (true);


    }

    private String getType(){
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("print into type");
            String str = br.readLine();
            return str;
        }catch (Exception e){
            e.printStackTrace();
        }
        return "";
    }


}











