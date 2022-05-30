package com.implon.designpattern.singleton;

public class InnerClassMode {
    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println(InnerClassSingletonClass.getInstance());
        }).start();
        new Thread(() -> {
            System.out.println(InnerClassSingletonClass.getInstance());
        }).start();
    }

    static class InnerClassSingletonClass {
        private InnerClassSingletonClass() {

        }
        private static class SingletonInstance {
            private static InnerClassSingletonClass instance = new InnerClassSingletonClass();
        }
        public static InnerClassSingletonClass getInstance() {
            return SingletonInstance.instance;
        }
    }
}
