package com.corp.helloWorld;

import java.sql.DriverManager;

public class HelloWorldJava {

    public static void main(String[] args) {
        String value = "Hello World!";
        Class<? extends String> clazz = value.getClass();
        assert clazz == String.class;

//      Получим null
        System.out.println(clazz.getClassLoader());

//      Получим jdk.internal.loader.ClassLoaders$PlatformClassLoader@5f184fc6
        System.out.println(DriverManager.class.getClassLoader());
//      Получим jdk.internal.loader.ClassLoaders$AppClassLoader@2f0e140b
        System.out.println(HelloWorldJava.class.getClassLoader());

        var boot = ModuleLayer.boot();
        boot.modules().forEach(module -> {
            var classLoader = module.getClassLoader();
            System.out.println(classLoader + ": " + module.getName());
        });
    }
}
