package org.design_patterns.flyweight;

/**
 * @version v1.0
 * @ClassName AbstractBox
 * @Description 抽象享元角色
 * @Author Q
 */
public abstract class AbstractBox {

    //獲取圖形方法
    public abstract String getShape();

    //顯示圖形及顔色
    public void display(String color) {
        System.out.println("方塊形狀" + getShape() + ", 顔色" + color);
    }
}
