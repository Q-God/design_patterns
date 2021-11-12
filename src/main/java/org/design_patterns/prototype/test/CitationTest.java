package org.design_patterns.prototype.test;

public class CitationTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation c1 = new Citation();
        c1.setName("张三");

        //复制奖状
        Citation c2 = c1.clone();
        //将奖状的的名字修改为李四
        c2.setName("李四");

        c1.show();
        c2.show();
    }
}
