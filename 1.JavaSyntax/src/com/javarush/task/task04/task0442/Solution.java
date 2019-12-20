package com.javarush.task.task04.task0442;

/* 
Суммирование
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int b = 0;
        while (true)
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String g = reader.readLine();
            int a = Integer.parseInt(g);
            b += a;
            if (a == -1)
                break;
        }
        System.out.println(b);
    }
}
