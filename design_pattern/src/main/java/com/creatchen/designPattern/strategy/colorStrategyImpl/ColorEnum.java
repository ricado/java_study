package com.creatchen.designPattern.strategy.colorStrategyImpl;

import com.creatchen.designPattern.strategy.ColorStrategy;
import com.creatchen.designPattern.strategy.Strategy;

/**
 * 颜色策略的枚举类
 */
public enum ColorEnum implements Strategy<ColorStrategy>{

    /**
     * 红色
     */
    RED {
        @Override
        public Class getStrategyClass() {
            return RedStrategy.class;
        }
    },
    /**
     * 蓝色
     */
    BLUE {
        @Override
        public Class getStrategyClass() {
            return BlueStrategy.class;
        }
    },

    /**
     * 原谅色
     */
    GREEN {
        @Override
        public Class getStrategyClass() {
            return GreenStrategy.class;
        }
    };
}
