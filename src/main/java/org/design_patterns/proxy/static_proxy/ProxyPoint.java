package org.design_patterns.proxy.static_proxy;

/**
 * 静态代理类(火车票代售点)
 */
public class ProxyPoint implements SellTickets {

    //声明火车站卖票
    private final TrainStation trainStation = new TrainStation();


    @Override
    public void sell() {
        System.out.println("代售点收取一点服务费用");
        trainStation.sell();
    }
}
