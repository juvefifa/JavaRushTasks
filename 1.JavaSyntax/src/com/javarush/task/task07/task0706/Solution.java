package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int[] list = new int[15];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int  i = 0; i < (list.length); i++)
        {
            String s = reader.readLine();
            list[i] = Integer.parseInt(s);
        }
        int sumOdd = 0;
        int sumEven = 0;

        for (int i = 0; i < 15; i++) {
            if (i % 2 == 0)
                sumEven = sumEven + list[i];
            else
                sumOdd = sumOdd + list[i];
        }


        if (sumEven > sumOdd)
            System.out.println("В домах с четными номерами проживает больше жителей.");
        else
            System.out.println("В домах с нечетными номерами проживает больше жителей.");

    }
}
