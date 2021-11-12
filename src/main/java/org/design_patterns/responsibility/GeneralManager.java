package org.design_patterns.responsibility;

/**
 * @version v1.0
 * @ClassName GroupLeader
 * @Description 部门经理类（具体的处理着）
 * @Author Q
 */
public class GeneralManager extends Handler {

    public GeneralManager() {
        super(Handler.NUM_THREE, Handler.NUM_SEVEN);
    }

    @Override
    protected void handleLeave(LeaveRequest leaveRequest) {
        System.out.println(leaveRequest.getName() + "请假" + "天，" + leaveRequest.getContent());
        System.out.println("总经理审批：通过");
    }
}
