package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int N = Integer.parseInt(s);//3
        String h = reader.readLine();
        int M = Integer.parseInt(h);//2

        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < N; i++){
            String k = reader.readLine();
            list.add(k);
        }

        for(int i = 0; i < M; i++){
            list.add(list.get(0));
            list.remove(0);
        }

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
