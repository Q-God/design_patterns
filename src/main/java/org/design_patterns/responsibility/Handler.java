package org.design_patterns.responsibility;

/**
 * @version v1.0
 * @ClassName Handler
 * @Description 抽象处理者类
 * @Author Q
 */
public abstract class Handler {
    protected final static int NUM_ONE = 1;
    protected final static int NUM_THREE = 3;
    protected final static int NUM_SEVEN = 7;

    //该领导处理的请求天数区间
    private final int numStart;
    private int numEnd;

    //声明后继者（声明上级领导）
    private Handler nextHandler;

    public Handler(int numStart) {
        this.numStart = numStart;
    }

    public Handler(int numStart, int numEnd) {
        this.numStart = numStart;
        this.numEnd = numEnd;
    }

    //设置上级领导对象
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    //各级领导处理请假条的方法
    protected abstract void handleLeave(LeaveRequest leaveRequest);

    //提交i请假条
    public final void submit(LeaveRequest leaveRequest) {
        //该领导先进性审批
        this.handleLeave(leaveRequest);
        if (this.nextHandler != null && leaveRequest.getNum() > this.numEnd) {
            //提交给上级领导进行审批
            this.nextHandler.submit(leaveRequest);
        } else {
            System.out.println("流程结束！");
        }
    }
}
