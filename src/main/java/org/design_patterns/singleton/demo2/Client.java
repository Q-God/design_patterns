package org.design_patterns.singleton.demo2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @version v1.0
 * @ClassName: Client
 * @Description: TODO(一句话描述该类的功能)
 * @Author: 黑马程序员
 */
public class Client {
    public static void main(String[] args) {

        ExecutorService threadPool = Executors.newFixedThreadPool(200);

        for (int i = 0; i < 200; i++) {
            threadPool.execute(() -> {
                System.out.println(Thread.currentThread().getName() + ": " + org.design_patterns.singleton.demo3.Singleton.getInstance());
            });
        }

        threadPool.shutdown();
        Singleton instance = Singleton.getInstance();

        Singleton instance1 = Singleton.getInstance();

        //判断两次获取到的Singleton对象是否是同一个对象
        System.out.println(instance == instance1);
    }
}
