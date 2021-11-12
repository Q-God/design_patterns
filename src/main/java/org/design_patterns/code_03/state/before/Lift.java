package org.design_patterns.code_03.state.before;

/**
 * @version v1.0
 * @ClassName Lift
 * @Description TODO
 * @Author Q
 */
public class Lift implements ILift {

    //声明一个记录当前电梯状态的一个变量
    private int state;

    @Override
    public void setState(int state) {
        this.state = state;
    }

    @Override
    public void open() {
        switch (state) {
            case OPENING_STATE:
                //什么事情都不做
                break;
            case CLOSEING_STATE:
                System.out.println("电梯打开了...");
                //设置当前电梯状态为开启状态
                setState(OPENING_STATE);
                break;
            case RUNNING_STATE:
                //什么事情都不做
                break;
            case STOPPING_STATE:
                System.out.println("电梯打开了...");
                //设置当前电梯状态为开启状态
                setState(OPENING_STATE);
                break;
        }
    }

    @Override
    public void close() {
        switch (state) {
            case OPENING_STATE:
                System.out.println("电梯关闭了...");
                //设置当前电梯状态为开启状态
                setState(CLOSEING_STATE);
                break;
            case CLOSEING_STATE:
                //什么事情都不做
                break;
            case RUNNING_STATE:
                //什么事情都不做
                break;
            case STOPPING_STATE:
                //电梯停止的时候也是关着门的
                break;
        }
    }

    @Override
    public void run() {
        switch (state) {
            case OPENING_STATE:
                //电梯不能开着门就走
                break;
            case CLOSEING_STATE:
                //门关了，电梯可以运行了
                System.out.println("电梯开始运行了...");
                setState(RUNNING_STATE);
                break;
            case RUNNING_STATE:
                //什么事情都不做
                break;
            case STOPPING_STATE:
                //停止状态电梯可以运行了
                System.out.println("电梯开始运行了...");
                setState(RUNNING_STATE);
                break;
        }
    }

    @Override
    public void stop() {
        switch (state) {
            case OPENING_STATE:
                //开门的电梯已经停止运行
                break;
            case CLOSEING_STATE:
                //门关了，电梯可以运行了
                System.out.println("电梯停止了...");
                setState(STOPPING_STATE);
                break;
            case RUNNING_STATE:
                System.out.println("电梯停止了...");
                setState(STOPPING_STATE);
                break;
            case STOPPING_STATE:
                //什么都不做
                break;
        }

    }
}
