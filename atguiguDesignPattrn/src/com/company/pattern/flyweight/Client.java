package com.company.pattern.flyweight;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-06-24 16:05
 * @description:
 **/
public class Client {
    public static void main(String[] args) {
        //创建一个工厂类
        WebSiteFactory webSiteFactory = new WebSiteFactory();

        //提供一个明确的网站类型
        WebSite site = webSiteFactory.getWebSite("新闻");
        site.use(new User("tom"));
        
    }
}




















