package org.design_patterns.factory.simple_factroy;

/**
 * 简单工厂模式
 */
public class SimpleCoffeeFactory {

    public Coffee createCoffee(String type) {
        //声明Coffee类型变量，根据不同类型创建不同的Coffee子类
        Coffee coffee = null;
        if ("american".equals(type)) {
            coffee = new AmericanCoffee();
        } else if ("latte".equals(type)) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("对不起，您点的咖啡不存在");
        }

        return coffee;
    }
}
