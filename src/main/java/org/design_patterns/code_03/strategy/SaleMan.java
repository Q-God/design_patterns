package org.design_patterns.code_03.strategy;

/**
 * @version v1.0
 * @ClassName Salesmen
 * @Description TODO
 * @Author Q
 */
public class SaleMan {
    //持有抽象策略角色引用
    private Strategy strategy;

    public SaleMan(Strategy strategy) {
        this.strategy = strategy;
    }

    //向刻苦展示促销活动
    public void saleManShow() {
        strategy.show();
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
