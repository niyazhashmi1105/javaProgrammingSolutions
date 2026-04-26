package com.java.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Runner {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
        Calculator cal = new Calculator();
        int result = cal.add(10,20);
        System.out.println(result);

        //Reflection
        //Class Reference

        Class<?> clazz = Calculator.class;
        Field x = clazz.getDeclaredField("x");
        x.setAccessible(true);
        System.out.println(x.getInt(cal));

        Method addMethod = clazz.getMethod("add", int.class, int.class);
        int result2 = (int) addMethod.invoke(cal, 30, 40);
        System.out.println(result2);

        Method privateMethod = clazz.getDeclaredMethod("message",String.class);
        privateMethod.setAccessible(true);
        String msg  = (String)privateMethod.invoke(cal,"Hello");
        System.out.println(msg);

        Method demo = clazz.getMethod("demo");
        demo.invoke(null);

        Constructor<?> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        Calculator instance = (Calculator) constructor.newInstance();



    }
}
