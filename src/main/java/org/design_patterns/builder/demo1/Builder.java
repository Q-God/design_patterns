package org.design_patterns.builder.demo1;

public abstract class Builder {

    //声明Bike对象并赋值
    protected Bike bike = new Bike();

    public abstract void buildFrame();

    public abstract void buildSet();

    //构建自行车的方法
    public abstract Bike creteBike();
}
