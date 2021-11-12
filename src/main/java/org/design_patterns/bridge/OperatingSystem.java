package org.design_patterns.bridge;

/**
 * 操作系统抽象化角色
 */
public abstract class OperatingSystem {

    //声明VideoFile变量
    protected VideoFile videoFile;

    public OperatingSystem(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    public abstract void play(String filename);
}
