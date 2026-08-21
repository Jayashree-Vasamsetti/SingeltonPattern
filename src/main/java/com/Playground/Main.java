package com.Playground;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    //Singleton s= new Singleton(); // This line will cause a compilation error because the constructor is private

//        Singleton singletonobject = Singleton.getInstance() ;
//        // correct way to get object of Singleton class
//
//        Singleton singletonobject2 = Singleton.getInstance() ;
//
//        System.out.println(singletonobject.hashCode());
//        System.out.println(singletonobject2.hashCode());
// PART 2: Multithreading environment
        Thread t1= new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton object1=Singleton.getInstance();
                System.out.println("I AM Thread one : " + object1.hashCode());

            }
        });
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton object2=Singleton.getInstance();
                System.out.println("I AM Thread two : " +object2.hashCode());
            }
        });

        t1.start();
        t2.start();

    }
}