package org.design_patterns.flyweight;

/**
 * @version v1.0
 * @ClassName Ibox
 * @Description 具體享元角色
 * @Author Q
 */
public class Ibox extends AbstractBox {
    @Override
    public String getShape() {
        return "I";
    }
}
