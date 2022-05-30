package com.implon.designpattern.singleton;

public class HungryMode {
    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println(HungrySingletonClass.getInstance());
        }).start();
        new Thread(() -> {
            System.out.println(HungrySingletonClass.getInstance());
        }).start();
    }
}

class HungrySingletonClass {
    private static HungrySingletonClass instance = new HungrySingletonClass();
    private HungrySingletonClass() {

    }
    public static HungrySingletonClass getInstance() {
        return instance;
    }
}