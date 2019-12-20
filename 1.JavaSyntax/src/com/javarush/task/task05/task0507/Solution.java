package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        double b = 0;
        int c = 0;
        while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String g = reader.readLine();
            int a = Integer.parseInt(g);
            b += a;
            c++;
            if (a == -1)
            break;
        }
        System.out.println((b+1)/(c-1));
    }
}