package org.design_patterns.proxy.jdk_proxy;

/**
 * 测试类
 */
public class Client {
    public static void main(String[] args) {
        //获取代理对象
        //1.创建代理对象工厂
        ProxyFactory factory = new ProxyFactory();
        //2.使用factory对象的方法获取代理对象
        SellTickets proxyObject = factory.getProxyObject();
        //3.调用卖票方法
        proxyObject.sell();

        System.out.println(proxyObject.getClass());

        //让程序一直运行
        while (true) ;
    }
}
