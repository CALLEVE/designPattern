package com.company.pattern.prototype.deepclone;

import java.io.Serializable;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-06-01 21:15
 * @description: DeepCloneableTarget
 **/
public class DeepCloneableTarget implements Serializable,Cloneable {

    private static final long serialVersionUID = 1921964789011887114L;
    private String cloneName;
    private String cloneClass;

    public DeepCloneableTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    public DeepCloneableTarget() {

    }

    public String getCloneName() {
        return cloneName;
    }

    public void setCloneName(String cloneName) {
        this.cloneName = cloneName;
    }

    public String getCloneClass() {
        return cloneClass;
    }

    public void setCloneClass(String cloneClass) {
        this.cloneClass = cloneClass;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
