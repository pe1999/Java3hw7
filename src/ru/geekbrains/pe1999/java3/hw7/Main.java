package ru.geekbrains.pe1999.java3.hw7;

public class Main {

    public static void main(String[] args) {
        TestsExecutor.start(TestClass1.class);
        System.out.println();
        TestsExecutor.start(TestClass1.class.getName());

    }
}
