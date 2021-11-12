package org.design_patterns.factory.abstract_factory;

public class Client {
    public static void main(String[] args) {
        //创建意大利风味甜品工厂
        DessertFactory factory = new ItalyDessertFactory();
        //获取拿铁咖啡和提拉米苏甜品
        Coffee italycoffee = factory.createCoffee();
        Dessert italyDessert = factory.createDessert();
        System.out.println(italycoffee.getName());
        italyDessert.show();
        factory = new AmericanDessertFactory();
        Coffee americanCoffee = factory.createCoffee();
        Dessert americanDesert = factory.createDessert();
        System.out.println(americanCoffee.getName());
        americanDesert.show();

    }
}
