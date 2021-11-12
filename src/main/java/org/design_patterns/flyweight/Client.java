package org.design_patterns.flyweight;

/**
 * @version v1.0
 * @ClassName Client
 * @Description TODO
 * @Author Q
 */
public class Client {
    public static void main(String[] args) {
        //獲取I圖形對象
        AbstractBox box1 = BoxFactory.getInstance().getShape("I");
        box1.display("灰色");
        //獲取I圖形對象
        AbstractBox box2 = BoxFactory.getInstance().getShape("L");
        box2.display("綠色");
        //獲取I圖形對象
        AbstractBox box3 = BoxFactory.getInstance().getShape("O");
        box3.display("灰色");

        AbstractBox box4 = BoxFactory.getInstance().getShape("O");
        box4.display("紅色");

        System.out.println("兩次獲取到的O圖形對象是否是同一個對象: " + (box3 == box4));
    }
}
