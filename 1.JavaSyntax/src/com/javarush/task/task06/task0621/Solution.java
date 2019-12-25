package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandfatherName = reader.readLine();
        Cat catGrandfather = new Cat(grandfatherName);

        String grandmotherName = reader.readLine();
        Cat catGrandmother = new Cat(grandmotherName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, null, catGrandfather);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catGrandmother, null);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMother, catFather);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catFather);

        System.out.println(catGrandfather);
        System.out.println(catGrandmother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat catMother;
        private Cat catFather;
//        private Cat catParent;

        Cat(String name) {
            this.name = name;
        }

       /*
        Cat(String name, Cat catMother) {
            this.name = name;
            this.catMother = catMother;
        }

        */

        Cat(String name, Cat catMother, Cat catFather) {
            this.name = name;
            this.catMother = catMother;
            this.catFather = catFather;
        }
        @Override
        public String toString() {
            if ((catMother == null) && (catFather == null))
                return "The cat's name is " + name + ", no mother, no father";
            else if (catMother == null)
                return "The cat's name is " + name + ", no mother" + ", father is " + catFather.name;
            else if (catFather == null)
                return "The cat's name is " + name + ", mother is " + catMother.name + ", no father";
            else
                return "The cat's name is " + name + ", mother is " + catMother.name + ", father is " + catFather.name;


        }


    }

}







/*

//ОРИГИНАЛ


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother);

        System.out.println(catMother);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat parent;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parent) {
            this.name = name;
            this.parent = parent;
        }

        @Override
        public String toString() {
            if (parent == null)
                return "The cat's name is " + name + ", no mother ";
            else
                return "The cat's name is " + name + ", mother is " + parent.name;
        }
    }

}
 */