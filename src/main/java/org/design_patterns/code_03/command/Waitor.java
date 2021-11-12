package org.design_patterns.code_03.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @version v1.0
 * @ClassName Waitor
 * @Description 服务员类 请求者角色
 * @Author Q
 */
public class Waitor {

    //持有多个命令对象
    private final List<Command> commands = new ArrayList<>();

    public void setCommand(Command cmd) {
        //把cmd对象存储到list集合中去
        commands.add(cmd);
    }

    //发起命令功能 喊订单来了
    public void orderUp() {
        System.out.println("美女服务员：大厨，新订单来了。。。。");
        for (Command command : commands) {
            if (command != null) {
                command.execute();
            }
        }
    }
}
