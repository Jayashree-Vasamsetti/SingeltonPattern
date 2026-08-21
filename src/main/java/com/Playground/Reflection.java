package com.Playground;

import java.lang.reflect.Constructor;

import static java.lang.reflect.AccessibleObject.setAccessible;

public class Reflection {

    //create a object using reflection
    public static void main(String[] args) throws Exception {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2= null;
// here we are using reflection to create a new instance of Singleton class
        //it is breaking the singleton pattern because we are able to create a new instance of Singleton class using reflection
       Constructor<Singleton> constructor= Singleton.class.getDeclaredConstructor();
       constructor.setAccessible(true);
       instance2= constructor.newInstance();

        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
// we can acheive the singleton pattern by throwing an exception
// in the constructor if the instance is already created

}}
