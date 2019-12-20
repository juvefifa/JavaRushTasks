package com.javarush.task.task04.task0441;

/* 
Как-то средненько
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

        if ((a != b) && (b != c)){
            if (((a > b) && (a < c)) || ((a < b) && (a > c)))
                System.out.println(a);
            if (((b > c) && (b < a)) || ((b < c) && (b > a)))
                System.out.println(b);
            if (((c > b) && (c < a)) || ((c < b) && (c > a)))
                System.out.println(c);
        }
        if ((a == b) && (b == c))
            System.out.println(a);
        else {
            if (a == b)
                System.out.println(a);
            if (a == c)
                System.out.println(a);
            if (c == b)
                System.out.println(c);
        }
    }
}
