package org.design_patterns.builder.demo2;

public class MobileBuilder extends Builder {
    @Override
    public void buildFrame() {
        bike.setFrame("碳纤维车架");
    }

    @Override
    public void buildSet() {
        bike.setSeat("真皮车座");
    }

    @Override
    public Bike creteBike() {
        return bike;
    }
}
