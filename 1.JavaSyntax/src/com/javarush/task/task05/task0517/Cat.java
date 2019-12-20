package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    String name = null;
    int age;
    int weight;
    String address = null;
    String color;

    public Cat(String name){
        this.name = name;
        this.age = 3;
        this.weight = 4;
        this.color = "red";
    }

    public Cat(String name, int weight, int age){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "grey";
    }

    public Cat(String name, int age){
        this.name = name;
        this.age = age;
        this.weight = 5;
        this.color = "red";
    }

    public Cat(int weight, String color){
        this.age = 7;
        this.weight = weight;
        this.color = color;
    }

    public Cat(int weight, String color, String address){
        this.age = 2;
        this.weight = weight;
        this.address = address;
        this.color = color;
    }

    public static void main(String[] args) {

    }
}
