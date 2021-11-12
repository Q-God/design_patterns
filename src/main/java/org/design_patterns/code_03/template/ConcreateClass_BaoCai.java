package org.design_patterns.code_03.template;

/**
 * @version v1.0
 * @ClassName ConcreateClass_BaoCai
 * @Description 包菜
 * @Author Q
 */
public class ConcreateClass_BaoCai extends AbstractClass {
    @Override
    public void pourVegetable() {
        System.out.println("下锅的蔬菜是包菜");
    }

    @Override
    public void pourSause() {
        System.out.println("下锅的酱料是辣椒");
    }
}
