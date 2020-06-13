package com.company.pattern.prototype.deepclone;

import java.io.*;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-06-01 21:14
 * @description: DeepProtoType
 **/
public class DeepProtoType implements Serializable,Cloneable {

    private static final long serialVersionUID = -6268186903530443695L;
    private String name;
    private DeepCloneableTarget deepCloneableTarget;

    public DeepProtoType() {

    }

    public DeepProtoType(String name, DeepCloneableTarget deepCloneableTarget) {
        this.name = name;
        this.deepCloneableTarget = deepCloneableTarget;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeepCloneableTarget getDeepCloneableTarget() {
        return deepCloneableTarget;
    }

    public void setDeepCloneableTarget(DeepCloneableTarget deepCloneableTarget) {
        this.deepCloneableTarget = deepCloneableTarget;
    }

    //实现深复制的两种方式
    //方式1:重写clone方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        //重写clone需要注意，基本数据类型和引用类型
        //在此例中,存在基本类型和String，基于String的特殊性，与基本类型具有某些相同特性
        //对于引用类型，需要对属性单独进行一次clone
        Object clone = super.clone();
        DeepProtoType deepProtoType = (DeepProtoType) clone;
        deepProtoType.deepCloneableTarget =(DeepCloneableTarget)deepCloneableTarget.clone();
        return deepProtoType;
    }

    //方式2:通过对象的序列化实现 (推荐)
    public Object deepClone(){
        //创建流对象  字节数组流和对象流
        //先输出再输入
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            //序列化  对象--》字节流
            //先是外围流，在是内部流
            //先申明外部流
            bos = new ByteArrayOutputStream();
            //将外部流与内部流进行绑定
            //ObjectOutputStream流的创建必须依赖于外部流,
            //如下该流的构建必须依赖于其他的外部流，主要就是ByteArrayOutputStream
            //所以先构建出
            oos = new ObjectOutputStream(bos);
            //将当前对象以流的形势输出，通过内部流绑定需要输出的对象
            //通过上面的操作，最后在对象以流的形势输出到 字节流中
            oos.writeObject(this);

            //反序列化 字节流--》对象
            //显示内部流，再是外部流
            //先将流转化为字节数组，然后再将流
            bis = new ByteArrayInputStream(bos.toByteArray());
            //将接收到的字节流，载入到对象流中
            ois = new ObjectInputStream(bis);
            DeepProtoType object =(DeepProtoType) ois.readObject();
            return object;
        }catch (Exception ex){
            ex.printStackTrace();
            return null;
        }finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

}
