package com.creatchen.designPattern.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 懒汉式单例(在第一次调用的时候实例化)
 *
 * @author creatchen
 * @date 2018-06-02
 */
public class LazySingleton {

    private static LazySingleton lazySingleton;

    private int i = 0;

    private static class  LazyHolder{
        private static final LazySingleton lazy = new LazySingleton();
    }

    private LazySingleton() {
        System.out.println("lazySingleton");
    }

    /**
     * 非线程安全的懒汉式写法
     *
     * @return LazySingleton
     */
    public static LazySingleton getInstance1() {
        if (null == lazySingleton) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

    public static synchronized LazySingleton getInstance2() {
        if (null == lazySingleton) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

    public static LazySingleton getInstance3(){
        if(null == lazySingleton){
            synchronized (LazySingleton.class){
                if(null == lazySingleton){
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }

    public static LazySingleton getInstance4(){
//        System.out.println("lazySingleton test");
        return LazyHolder.lazy;
    }

    public static void main(String[] args) {
        int size = 100;
        ExecutorService executorService = Executors.newScheduledThreadPool(size);

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size * 1000; i++) {
//            executorService.submit(() -> LazySingleton.getInstance1().print());
            executorService.submit(() -> LazySingleton.getInstance1());
        }
        executorService.shutdown();
        while (!executorService.isTerminated()) {
        }
        long endTime = System.currentTimeMillis();
        System.out.println("耗时 = " + (endTime - startTime) + "ms");
    }

    public synchronized void print() {
        i++;
        System.out.println("number : " + i);
    }
}
