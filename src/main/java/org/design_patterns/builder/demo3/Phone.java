package org.design_patterns.builder.demo3;

/**
 * 手机类
 */
public class Phone {

    private final String cpu;

    private final String screen;

    private final String memory;

    private final String mainboard;

    //私有构造方法
    private Phone(Builder builder) {
        this.cpu = builder.cpu;
        this.screen = builder.screen;
        this.memory = builder.memory;
        this.mainboard = builder.mainboard;
    }

    public static final class Builder {
        private String cpu;
        private String screen;
        private String memory;
        private String mainboard;

        public Builder cpu(String val) {
            this.cpu = val;
            return this;
        }

        public Builder screen(String val) {
            this.screen = val;
            return this;
        }

        public Builder memory(String val) {
            this.memory = val;
            return this;
        }

        public Builder mainboard(String val) {
            this.mainboard = val;
            return this;
        }

        public Phone build() {
            return new Phone(this);
        }
    }

    @Override
    public String toString() {
        return "Phone{" +
                "cpu='" + cpu + '\'' +
                ", screen='" + screen + '\'' +
                ", memory='" + memory + '\'' +
                ", mainboard='" + mainboard + '\'' +
                '}';
    }
}
