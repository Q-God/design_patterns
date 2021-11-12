package org.design_patterns.responsibility;

/**
 * @version v1.0
 * @ClassName GroupLeader
 * @Description 部门经理类（具体的处理着）
 * @Author Q
 */
public class Manager extends Handler {

    public Manager() {
        super(Handler.NUM_ONE, Handler.NUM_THREE);
    }

    @Override
    protected void handleLeave(LeaveRequest leaveRequest) {
        System.out.println(leaveRequest.getName() + "请假" + "天，" + leaveRequest.getContent());
        System.out.println("部门经理审批：通过");
    }
}
