package org.design_patterns.builder.demo2;

/**
 * 构建Ofo单车
 */
public class OfoBuilder extends Builder {
    @Override
    public void buildFrame() {
        bike.setFrame("铝合金车架");
    }

    @Override
    public void buildSet() {
        bike.setSeat("橡胶车座");
    }

    @Override
    public Bike creteBike() {
        return bike;
    }
}
