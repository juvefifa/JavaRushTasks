package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] list1 = new String[10];
        int[] list2 = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < list1.length; i++)
        {
            list1[i]= reader.readLine();
        }

        for (int i = 0; i < list2.length; i++)
        {
            list2[i] = list1[i].length();
            System.out.println(list2[i]);
        }

    }
}
