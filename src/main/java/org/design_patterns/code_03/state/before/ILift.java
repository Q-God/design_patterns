package org.design_patterns.code_03.state.before;

/**
 * @version v1.0
 * @ClassName ILift
 * @Description 电梯类抽象类
 * @Author Q
 */
public interface ILift {

    //定义四个电梯状态常量
    int OPENING_STATE = 1;
    int CLOSEING_STATE = 2;
    int RUNNING_STATE = 3;
    int STOPPING_STATE = 4;

    //设置电梯状态的功能
    void setState(int state);

    //电梯状态功能
    void open();

    void close();

    void run();

    void stop();
}
