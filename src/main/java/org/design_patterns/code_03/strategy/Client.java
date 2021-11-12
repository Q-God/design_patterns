package org.design_patterns.code_03.strategy;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * @version v1.0
 * @ClassName Client
 * @Description TODO
 * @Author Q
 */
public class Client {
    public static void main(String[] args) {
        //春节来了，使用春节促销
        SaleMan saleMan = new SaleMan(new StrategyA());
        //展示促销活动
        saleMan.saleManShow();
        System.out.println("=====================");


        //中秋节促销活动
        saleMan.setStrategy(new StrategyB());
        //展示促销活动
        saleMan.saleManShow();
    }
}
