package org.design_patterns.prototype.deepclone;

/**
 * 浅克隆
 */
public class CitationTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation c1 = new Citation();
        Student stu = new Student();
        stu.setName("张三");
        c1.setStu(stu);
        //复制奖状
        Citation c2 = c1.clone();
        //将奖状的的名字修改为李四
        Student stu1 = c2.getStu();
        stu1.setName("李四");

        c1.show();
        c2.show();
    }
}
