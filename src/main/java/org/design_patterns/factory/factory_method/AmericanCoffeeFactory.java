package org.design_patterns.factory.factory_method;

/**
 * 具体工厂
 */
public class AmericanCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
