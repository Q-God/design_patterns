package org.design_patterns.prototype.deepclone;

import java.io.*;

/**
 * 深克隆
 */
public class CitationTest1 {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        Citation c1 = new Citation();
        Student stu = new Student();
        stu.setName("张三");
        c1.setStu(stu);
        //创建对象输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("e:/robin/a.txt"));
        //写对象
        oos.writeObject(c1);
        //释放资源
        oos.close();

        //创建对象输入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("e:/robin/a.txt"));
        //读对象
        Citation c2 = (Citation) ois.readObject();
        //释放资源
        ois.close();

        //将奖状的的名字修改为李四
        Student stu1 = c2.getStu();
        stu1.setName("李四");

        c1.show();
        c2.show();
    }
}
