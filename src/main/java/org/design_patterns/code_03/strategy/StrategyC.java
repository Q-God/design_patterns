package org.design_patterns.code_03.strategy;

/**
 * @version v1.0
 * @ClassName StrategyA
 * @Description 策略C
 * @Author Q
 */
public class StrategyC implements Strategy{
    @Override
    public void show() {
        System.out.println("满1000元加一元换购任意200元以下商品");
    }
}
