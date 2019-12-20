package com.javarush.task.task05.task0532;

import javax.print.DocFlavor;
import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        if (N > 0) {
            int maximum = Integer.parseInt(reader.readLine());
            while (N > 0) {
                if (N > 1) {
                    int a = Integer.parseInt(reader.readLine());
                    maximum = a < maximum ? maximum : a;
                }
                N--;
            }
            System.out.println(maximum);
        }
    }
}