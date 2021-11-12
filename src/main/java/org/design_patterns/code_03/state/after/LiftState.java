package org.design_patterns.code_03.state.after;

/**
 * @version v1.0
 * @ClassName LiftState
 * @Description 环境角色类
 * @Author Q
 */
public abstract class LiftState {

    //声明环境角色类变量
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    //电梯开启操作
    public abstract void open();
    //电梯关闭操作
    public abstract void close();
    //电梯运行操作
    public abstract void run();
    //电梯停止操作
    public abstract void stop();
}
