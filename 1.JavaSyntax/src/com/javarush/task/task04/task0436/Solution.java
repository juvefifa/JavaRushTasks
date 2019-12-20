package com.javarush.task.task04.task0436;

/* 
Рисуем прямоугольник
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        int m = Integer.parseInt(a);
        String e = reader.readLine();
        int n = Integer.parseInt(e);

        for (int f = 0; f < m; f++) {
            for (int c = 0; c < n; c++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
