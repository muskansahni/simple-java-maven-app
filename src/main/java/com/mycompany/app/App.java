package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Hello Happiest Minds!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
        System.out.println("Hellow World");
    }

    private final String getMessage() {
        return message;
    }

}
