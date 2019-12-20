package com.javarush.task.task04.task0424;

/* 
Три числа
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

        if (a == b){
            System.out.println("3");}
        else {
            if (a == c) {
                System.out.println("2");}
            else if (b == c)
                System.out.println("1");
            }
    }
}
