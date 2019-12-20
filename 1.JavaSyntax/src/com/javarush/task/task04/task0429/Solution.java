package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
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

int p = 0;
int o = 0;

if (a > 0)
    p++;
if (a < 0)
    o++;

if (b > 0)
    p++;
if (b < 0)
    o++;

if (c > 0)
    p++;
if (c < 0)
    o++;
        System.out.println("количество отрицательных чисел: " + o);
        System.out.println("количество положительных чисел: " + p);
    }
}