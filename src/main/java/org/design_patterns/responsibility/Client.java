package org.design_patterns.responsibility;

import java.util.logging.Handler;

/**
 * @version v1.0
 * @ClassName Client
 * @Description TODO
 * @Author Q
 */
public class Client {
    public static void main(String[] args) {
        //创建一个请假条
        LeaveRequest leaveRequest = new LeaveRequest("小明", 1, "身体不适");

        //创建各级领导
        GroupLeader groupLeader = new GroupLeader();
        Manager manager = new Manager();
        GeneralManager generalManager = new GeneralManager();

        //设置处理者链
        groupLeader.setNextHandler(manager);
        manager.setNextHandler(generalManager);

        //小明提交请假条
        groupLeader.submit(leaveRequest);
    }
}
