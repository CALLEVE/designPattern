package com.company.pattern.flyweight;

import java.util.HashMap;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-06-24 15:51
 * @description:
 **/
public class WebSiteFactory {

    //构建一个集合，充当池的作用
    private HashMap<String,ConcreteWebSite> pool = new HashMap<>();


    //以下提供两个方法
    //根据网站的类型，返回一个网站，如果没有就创建一个网站，并放入到池中，并返回
    public WebSite getWebSite(String type){
        if(!pool.containsKey(type)){
            pool.put(type, new ConcreteWebSite(type));
        }
        return (WebSite) pool.get(type);
    }

    //
    public int getCount(){
        return pool.size();
    }


}










