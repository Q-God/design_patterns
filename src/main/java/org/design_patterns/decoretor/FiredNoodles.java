package org.design_patterns.decoretor;

/**
 * 炒面类(具体构建角色)
 */
public class FiredNoodles extends FastFood {

    public FiredNoodles() {
        super(12, "炒面");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
