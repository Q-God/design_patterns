package org.design_patterns.builder.demo1;

/**
 * 指挥者类
 */
public class Director {

    //声明Builder对象
    private final Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    //组装自行车功能
    public Bike construct() {
        builder.buildFrame();
        builder.buildSet();
        return builder.creteBike();
    }
}
