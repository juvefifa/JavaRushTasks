package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        int c1 = 0;
        int c2 = 0;
        if (this.age > anotherCat.age)
            c1++;
        if (this.age < anotherCat.age)
            c2++;
        if (this.weight > anotherCat.weight)
            c1++;
        if (this.weight < anotherCat.weight)
            c2++;
        if (this.strength > anotherCat.strength)
            c1++;
        if (this.strength < anotherCat.strength)
            c2++;

        if (c1 > c2)
            return true;
        else
            return false;

    }

    public static void main(String[] args) {

    }
}
