package com.implon.designpattern.singleton;

public class EnumMode {
    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println(EnumSingletonClass.ENUMINSTANCE);
        }).start();
        new Thread(() -> {
            System.out.println(EnumSingletonClass.ENUMINSTANCE);
        }).start();
    }
}

enum EnumSingletonClass {
    ENUMINSTANCE,
}
