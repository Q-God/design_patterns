package org.design_patterns.adapter.class_adapter;

public class TFCardImpl implements TFCard {
    @Override
    public String readTF() {
        String msg = "TFCard read msg : hello, world TFCard";
        return msg;
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("TFCard read msg : " + msg);
    }
}
