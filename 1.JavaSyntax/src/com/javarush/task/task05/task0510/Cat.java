package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    String name = null;
    int age;
    int weight;
    String address = null;
    String color;

    public void initialize(String name)
    {
        this.name = name;
        this.age = 2;
        this.weight = 3;
        this.color = "black";
    }

    public void initialize(String name, int weight, int age)
    {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "grey";
    }

    public void initialize(String name, int age)
    {
        this.name = name;
        this.age = age;
        this.weight = 3;
        this.color = "red";
    }

    public void initialize(int weight, String color)
    {
        this.age = 11;
        this.weight = weight;
        this.color = color;
    }

    public void initialize(int weight, String color, String address)
    {
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 8;
    }
    public static void main(String[] args) {

    }
}
