package org.design_patterns.code_03.command;

import java.util.Map;

/**
 * @version v1.0
 * @ClassName OrderCommand
 * @Description 具体命令类
 * @Author Q
 */
public class OrderCommand implements Command {

    //持有接收者对象
    private final SeniorChef receiver;
    //持有订单对象
    private final Order order;

    public OrderCommand(SeniorChef receiver, Order order) {
        this.receiver = receiver;
        this.order = order;
    }

    @Override
    public void execute() {
        System.out.println(order.getDiningTable() + "桌的订单：");
        Map<String, Integer> foodDir = order.getFoodDir();
        //遍历map集合
        for (Map.Entry<String, Integer> food : foodDir.entrySet()) {
            receiver.makeFood(food.getKey(), food.getValue());
        }
        System.out.println(order.getDiningTable() + "桌的饭准备完毕");
    }
}
