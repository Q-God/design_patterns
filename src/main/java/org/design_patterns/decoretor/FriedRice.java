package org.design_patterns.decoretor;

/**
 * 炒饭具体构件角色
 */
public class FriedRice extends FastFood {

    public FriedRice() {
        super(10, "炒饭");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
