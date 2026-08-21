package com.Playground;

public class Singleton {

    private static Singleton instance;

    private Singleton(){
        if(instance!=null){
            throw new RuntimeException("Use getInstance() method to create");
        }
        // private constructor to prevent instantiation
    }

//    public static Singleton getInstance() {
//        if (instance == null) {
//            instance = new Singleton();
//        }
//        return instance;
//    }
//
//    public void showMessage() {
//        System.out.println("Hello from Singleton!");
//    }

    //to make it accessible in multithreading environment
//Part 2: Multithreading environment
//    public static  synchronized  Singleton getInstance(){
//        if (instance == null) {
//            instance= new Singleton();
//        }
//        return instance;
//        }
// part 3 instead of sunchronising the complete method we can synchronise the block of code
        public static  Singleton getInstance() {
            if (instance == null) {
                synchronized (Singleton.class) {
                    if (instance == null) {
                        instance = new Singleton();
                    }
                }
            }
            return instance;

        }
}
