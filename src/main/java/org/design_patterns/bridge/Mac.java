package org.design_patterns.bridge;

/**
 * 扩展抽象化角色 Mac操作系统
 */
public class Mac extends OperatingSystem {
    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String filename) {
        videoFile.decode(filename);
    }
}
