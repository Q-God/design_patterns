package org.design_patterns.flyweight.jdk;

/**
 * @version v1.0
 * @ClassName Demo
 * @Description TODO
 * @Author Q
 */
public class Demo {
    public static void main(String[] args) {
        Integer i1 = 127;
        Integer i2 = 127;

        System.out.println("i1和i2對象是否為同一個對象" + (i1 == i2));

        Integer i3 = 128;
        Integer i4 = 128;

        System.out.println("i1和i2對象是否為同一個對象" + (i3 == i4 ));

    }
}
