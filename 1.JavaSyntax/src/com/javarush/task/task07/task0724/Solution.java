package com.javarush.task.task07.task0724;

/*
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human grandfather = new Human("Alex", true, 67);
        Human grandmother = new Human("Alexa", false, 65);
        Human grandfather1 = new Human("Tolik", true, 68);
        Human grandmother1 = new Human("Tonya", false, 68);
        Human father = new Human("Oleg", true, 44, grandfather, grandmother);
        Human mother = new Human("Liza", false, 42, grandfather1, grandmother1);
        Human son1 = new Human("Igor", true, 14, father, mother);
        Human son2 = new Human("Timur", true, 17, father, mother);
        Human son3 = new Human("Roman", true, 9, father, mother);

        System.out.println(grandfather);
        System.out.println(grandmother);
        System.out.println(grandfather1);
        System.out.println(grandmother1);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son1);
        System.out.println(son2);
        System.out.println(son3);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = null;
            this.mother = null;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}