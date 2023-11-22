package main;

import hello.HelloWorld;

import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args) {
        ServiceLoader<HelloWorld> serviceLoader=
                ServiceLoader.load(HelloWorld.class);
        serviceLoader.stream()
                .forEach(h-> System.out.println(h.get().sayHello()));
        System.out.println("Hello world!");
    }
}