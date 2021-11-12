package org.design_patterns.adapter.class_adapter;

/**
 * 具体SD卡
 */
public class SDCardImpl implements SDCard {
    @Override
    public String readSD() {
        String msg = "SDCare read msg : hello word SD";
        return msg;
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("SDCard write msg : " + msg);
    }
}
