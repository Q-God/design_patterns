package org.design_patterns.factory.before;

public class CoffeeStore {
    public Coffee orderCoffee(String type) {
        //声明Coffee类型变量，根据不同类型创建不同的Coffee子类
        Coffee coffee = null;
        if ("american".equals(type)) {
            coffee = new AmericanCoffee();
        } else if ("latte".equals(type)) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("对不起，您点的咖啡不存在");
        }
        //加配料
        coffee.addSugar();
        coffee.addMilk();
        return coffee;
    }
}
