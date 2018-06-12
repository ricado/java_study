package com.creatchen.designPattern.singleton;

/**
 * 饿汉单例
 */
public class HungrySingleton {

//    private static HungrySingleton hungry = new HungrySingleton();

    private static HungrySingleton hungry;

    static {
        hungry = new HungrySingleton();
    }

    private HungrySingleton(){
        System.out.println("hello hungry man singleton");
    }

    public static HungrySingleton getInstance(){
        return hungry;
    }

}
