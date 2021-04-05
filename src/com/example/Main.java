package com.example;

public class Main {
    public static void main(String[] args) {
        myMethod(() -> System.out.println("hihiii"));
    }
    public static void myMethod(MyInterface f){
        f.hi();
    }
}
