package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] bolshoy = new int[20];
        int[] mal1 = new int[10];
        int[] mal2 = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int  i = 0; i < (bolshoy.length); i++)
        {
            String s = reader.readLine();
            bolshoy[i] = Integer.parseInt(s);
        }

        for (int i = 0; i < bolshoy.length - 10; i++)
            mal1[i] = bolshoy[i];

        for (int i = 10; i < bolshoy.length; i++)
        {
            mal2[i-10] = bolshoy[i];
            System.out.println(mal2[i-10]);
        }
    }
}
