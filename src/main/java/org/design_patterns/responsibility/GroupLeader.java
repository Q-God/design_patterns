package org.design_patterns.responsibility;

import org.design_patterns.decoretor.Garnish;

/**
 * @version v1.0
 * @ClassName GroupLeader
 * @Description 小组长类（具体的矗立着）
 * @Author Q
 */
public class GroupLeader extends Handler {

    public GroupLeader() {
        super(0, Handler.NUM_ONE);
    }

    @Override
    protected void handleLeave(LeaveRequest leaveRequest) {
        System.out.println(leaveRequest.getName() + "请假" + "天，" + leaveRequest.getContent());
        System.out.println("小组长审批：通过");
    }
}
