package org.design_patterns.singleton.demo6;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @version v1.0
 * @ClassName: Client
 * @Description: TODO(一句话描述该类的功能)
 * @Author: 黑马程序员
 */
public class Client {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance1 = Singleton.INSTANCE;

        System.out.println(instance == instance1);
        Date date = new Date();
        System.out.println();
        long time = date.getTime();
        System.out.println("time = " + time);
        String s = (System.currentTimeMillis() + "").substring(0,4);
        System.out.println(s);



        LocalDateTime dateTime = LocalDateTime.now(); // get the current date and time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        System.out.println(dateTime.format(formatter));
        String l = System.currentTimeMillis()+"";
        StringBuilder sb = new StringBuilder();
        String string = sb.append(l.substring(0, 4)).append(dateTime.format(formatter)).append(l.substring(4, 13)).toString();
        System.out.println("string = " + string);

    }
}
