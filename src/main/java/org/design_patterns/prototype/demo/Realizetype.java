package org.design_patterns.prototype.demo;

public class Realizetype implements Cloneable {

    public Realizetype() {
        System.out.println("具体的原型对象创建完成！");
    }

    @Override
    protected Realizetype clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功" + this);

        return (Realizetype) super.clone();
    }
}
