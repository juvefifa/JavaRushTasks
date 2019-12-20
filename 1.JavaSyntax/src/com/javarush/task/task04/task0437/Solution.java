package com.javarush.task.task04.task0437;

/* 
Треугольник из восьмерок
*/

public class Solution {
    public static void main(String[] args) {

        for (int b = 1; b <= 10; b++) {
            for (int a = 1; a <= b; a++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}