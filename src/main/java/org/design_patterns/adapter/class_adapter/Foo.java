package org.design_patterns.adapter.class_adapter;

/**
 * @version v1.0
 * @ClassName Foo
 * @Description TODO
 * @Author Q
 */
public class Foo {
    static boolean flag;

    public static void main(String[] args) {
        flag = true;
        if (flag) System.out.println("Hello World");
        if (flag == true) System.out.println("Hello, JVM");
    }

}
