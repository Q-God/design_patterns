package org.design_patterns.proxy.static_proxy;

/**
 * 火车站卖票系统实现
 */
public class TrainStation implements SellTickets {


    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }
}
