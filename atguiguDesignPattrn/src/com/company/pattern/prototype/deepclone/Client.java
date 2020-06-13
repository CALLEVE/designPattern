package com.company.pattern.prototype.deepclone;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-06-01 20:28
 * @description: Client
 **/
public class Client {
    public static void main(String[] args) throws Exception {
        DeepProtoType deepProtoType = new DeepProtoType();
        deepProtoType.setName("宋江");
        deepProtoType.setDeepCloneableTarget(new DeepCloneableTarget("大牛", "小牛"));

        //方式1
//        DeepProtoType deepProtoType1 = (DeepProtoType)deepProtoType.clone();
//        System.out.println("deepProtoType.name:"+deepProtoType.getName()+
//                ",deepProtoType.DeepCloneableTarget:" +deepProtoType.getDeepCloneableTarget());
//
//        System.out.println("deepProtoType1.name:"+deepProtoType1.getName()+
//                ",deepProtoType1.DeepCloneableTarget:" +deepProtoType1.getDeepCloneableTarget());

        //方式2
        DeepProtoType deepProtoType2 = (DeepProtoType) deepProtoType.deepClone();
        System.out.println("deepProtoType.name:"+deepProtoType.getName()+
                ",deepProtoType.DeepCloneableTarget:" +deepProtoType.getDeepCloneableTarget());

        System.out.println("deepProtoType2.name:"+deepProtoType2.getName()+
                ",deepProtoType2.DeepCloneableTarget:" +deepProtoType2.getDeepCloneableTarget());

    }
}
