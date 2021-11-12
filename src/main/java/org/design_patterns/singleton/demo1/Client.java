package org.design_patterns.singleton.demo1;

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
        ExecutorService threadPool = Executors.newFixedThreadPool(20000);

        for (int i = 0; i < 20000; i++) {
            threadPool.execute(() -> {
                System.out.println(Thread.currentThread().getName() + ": " + org.design_patterns.singleton.demo3.Singleton.getInstance());
            });
        }

        threadPool.shutdown();
        //创建Singletion类的对象
        Singleton instance = Singleton.getInstance();

        Singleton instance1 = Singleton.getInstance();

        //判断获取到的两个是否是同一个对象
        System.out.println(instance == instance1);
    }
}
