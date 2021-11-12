package org.design_patterns.builder.demo2;

public class Client {
    public static void main(String[] args) {
        //创建指挥者对象
        Builder builder = new MobileBuilder();
        //让指挥者指挥组装自行车
        Bike bike = builder.construct();

        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());

    }
}
