package org.design_patterns.code_03.template;

/**
 * @version v1.0
 * @ClassName Client
 * @Description TODO
 * @Author Q
 */
public class Client {
    public static void main(String[] args) {
        //炒包菜
        //创建对象
        ConcreateClass_BaoCai baoCai = new ConcreateClass_BaoCai();
        //调用炒包菜的功能
        baoCai.cookProcess();
    }
}
