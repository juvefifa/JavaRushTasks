package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String c = reader.readLine();
        int a = Integer.parseInt(c);
        String d = reader.readLine();
        int b = Integer.parseInt(d);

        if (a > 0 && b > 0)
            System.out.println("1");
        else if (a < 0 && b > 0)
            System.out.println("2");
        else if (a < 0 && b < 0)
            System.out.println("3");
        else if (a > 0 && b < 0)
            System.out.println("4");
    }
}