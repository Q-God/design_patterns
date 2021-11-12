package org.design_patterns.code_03.strategy;

/**
 * @version v1.0
 * @ClassName StrategyA
 * @Description 策略B
 * @Author Q
 */
public class StrategyB implements Strategy{
    @Override
    public void show() {
        System.out.println("满200减50");
    }
}
