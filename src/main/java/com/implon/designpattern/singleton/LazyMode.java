package com.implon.designpattern.singleton;

public class LazyMode {
    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println(LazySingletonClass.getInstance());
        }).start();
        new Thread(() -> {
            System.out.println(LazySingletonClass.getInstance());
        }).start();
    }
}

class LazySingletonClass {
    private volatile static LazySingletonClass instance;
    private LazySingletonClass() {

    }
    public static LazySingletonClass getInstance() {
        if (instance == null) {
            synchronized (LazySingletonClass.class) {
                if (instance == null) {
                    // new实例化对象时
                    instance = new LazySingletonClass();
                }
            }
        }
        return instance;
    }
}
