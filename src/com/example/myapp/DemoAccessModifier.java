package com.example.myapp;

public class DemoAccessModifier {
    public String name;
    protected int marks;
    int age;
    private String email;

    private void greet() {
        System.out.println("Welcome");
    }

    public void greetUser(String userName) {
        System.out.print(userName + ", ");
        greet();
    }
}
