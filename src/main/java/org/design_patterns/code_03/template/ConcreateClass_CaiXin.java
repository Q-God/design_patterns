package org.design_patterns.code_03.template;

/**
 * @version v1.0
 * @ClassName ConcreateClass_BaoCai
 * @Description 菜心
 * @Author Q
 */
public class ConcreateClass_CaiXin extends AbstractClass {
    @Override
    public void pourVegetable() {
        System.out.println("下锅的蔬菜是菜心");
    }

    @Override
    public void pourSause() {
        System.out.println("下锅的酱料是蒜蓉");
    }
}
