package org.design_patterns.factory.simple_factroy;

public class CoffeeStore {
    public Coffee orderCoffee(String type) {
       SimpleCoffeeFactory factory = new SimpleCoffeeFactory();
        Coffee coffee = factory.createCoffee(type);
        //加配料
        coffee.addSugar();
        coffee.addMilk();
        return coffee;
    }
}
