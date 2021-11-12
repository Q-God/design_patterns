package org.design_patterns.flyweight;

import java.util.HashMap;

/**
 * @version v1.0
 * @ClassName BoxFactory
 * @Description TODO
 * @Author Q
 */
public class BoxFactory {

    private static final BoxFactory factory = new BoxFactory();
    private final HashMap<String, AbstractBox> map;

    private BoxFactory() {
        map = new HashMap<>();
        map.put("I", new Ibox());
        map.put("L", new Lbox());
        map.put("O", new Obox());
        map.put("Z", new Zbox());
        map.put("T", new Tbox());
        map.put("S", new Sbox());
    }

    //提供方法獲取工程對象
    public static BoxFactory getInstance() {
        return factory;
    }

    //根據名稱獲取圖形對象
    public AbstractBox getShape(String name) {
        return map.get(name);
    }
}
