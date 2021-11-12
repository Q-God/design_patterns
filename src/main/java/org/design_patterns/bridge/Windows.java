package org.design_patterns.bridge;

/**
 * 扩展抽象化角色 windows操作系统
 */
public class Windows extends OperatingSystem {
    public Windows(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String filename) {
        videoFile.decode(filename);
    }
}
