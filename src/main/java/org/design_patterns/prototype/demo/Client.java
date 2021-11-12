package org.design_patterns.prototype.demo;

/**
 * 原型模式
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Realizetype realizetype = new Realizetype();

        //调用原型类中的clone

        Realizetype clone = realizetype.clone();

        System.out.println("原型对象和克隆出来的是否为同一个对象" + (realizetype == clone));
    }
}
