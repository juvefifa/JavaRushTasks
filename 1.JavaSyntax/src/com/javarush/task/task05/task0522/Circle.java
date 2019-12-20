package com.javarush.task.task05.task0522;

/* 
Максимум конструкторов
*/

public class Circle {
    public double x;
    public double y;
    public double radius;

    public Circle(double radius)
    {
        this.y = 3.0;
        this.radius = radius;
        this.x = 2.0;
    }

    public Circle(double x, double radius)
    {
        this.x = x;
        this.radius = radius;
        this.y = 7.0;
    }

    public Circle(double x, double y, double radius)
    {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle()
    {
        this.x = 1.0;
        this.y = 2.0;
        this.radius = 3.0;
    }

    public static void main(String[] args) {

    }
}