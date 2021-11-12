package org.design_patterns.builder.demo2;

/**
 * 违反单一职责原则
 */
public abstract class Builder {

    //声明Bike对象并赋值
    protected Bike bike = new Bike();

    public abstract void buildFrame();

    public abstract void buildSet();

    //构建自行车的方法
    public abstract Bike creteBike();

    //组装自行车功能
    public Bike construct() {
        this.buildFrame();
        this.buildSet();
        return this.creteBike();
    }
}
