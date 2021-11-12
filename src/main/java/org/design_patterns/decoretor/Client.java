package org.design_patterns.decoretor;

public class Client {
    public static void main(String[] args) {
        //点一份炒饭
        FastFood food = new FriedRice();

        System.out.println(food.getDesc() + "   " + food.cost() + "元");

        System.out.println("==============");

        //加一个鸡蛋
        food = new Egg(food);

        System.out.println(food.getDesc() + "   " + food.cost() + "元");
        //再加一个鸡蛋
        System.out.println("===============");
        food = new Egg(food);

        System.out.println(food.getDesc() + "   " + food.cost() + "元");

        System.out.println("==============");
        //再加一个鸡蛋
        food = new Bacon(food);

        System.out.println(food.getDesc() + "   " + food.cost() + "元");
    }
}
