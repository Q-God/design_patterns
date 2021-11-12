package org.design_patterns.factory.abstract_factory;

/**
 * 抽象工厂模式
 */
public interface DessertFactory {
    //生产咖啡的功能
    Coffee createCoffee();

    //生产甜品的功能
    Dessert createDessert();
}
