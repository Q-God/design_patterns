package org.design_patterns.code_03.strategy;

/**
 * @version v1.0
 * @ClassName StrategyA
 * @Description 策略A
 * @Author Q
 */
public class StrategyA implements Strategy{
    @Override
    public void show() {
        System.out.println("买一送一");
    }
}
