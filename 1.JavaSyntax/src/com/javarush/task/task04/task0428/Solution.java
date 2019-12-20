package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String d = reader.readLine();
        int a = Integer.parseInt(d);
        String e = reader.readLine();
        int b = Integer.parseInt(e);
        String f = reader.readLine();
        int c = Integer.parseInt(f);

        if ((a > 0) && (b > 0) && (c > 0))
            System.out.println("3");
        else if (((a > 0) && (b > 0) && (c <= 0)) || ((a > 0) && (b <= 0) && (c > 0)) || ((a <= 0) && (b > 0) && (c > 0)))
            System.out.println("2");
        else if (((a > 0) && (b <= 0) && (c <= 0)) || ((a <= 0) && (b <= 0) && (c > 0)) || ((a <= 0) && (b > 0) && (c <= 0)))
            System.out.println("1");
        else if ((a <= 0) && (b <= 0) && (c <= 0))
            System.out.println("0");
    }
}