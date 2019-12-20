package com.javarush.task.task06.task0606;

import java.io.*;

import static java.lang.Math.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        /*int a = Integer.parseInt(reader.readLine());*/

        String b = reader.readLine();
        int count = b.length();
        int a = Integer.parseInt(b);

        for(; count > 0; count--){
        int razr = (int) (a / (pow(10, count - 1)));
        int ost = (int) (a % (pow(10, count - 1)));

        if (razr % 2 == 0)
            even++;
        else
            odd++;
        a = ost;
    }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
