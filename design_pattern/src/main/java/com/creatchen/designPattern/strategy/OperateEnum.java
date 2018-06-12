package com.creatchen.designPattern.strategy;

public enum OperateEnum implements Operate {
    ADD {
        @Override
        public int opera(int x, int y) {
            return add(x, y);
        }
    },

    SUB {
        @Override
        public int opera(int x, int y) {
            return x - y;
        }
    },

    MUTI {
        @Override
        public int opera(int x, int y) {
            return x * y;
        }
    };

    public int add(int a, int b) {
        return a + b;
    }
}