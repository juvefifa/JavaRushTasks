package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int minElement = 0;
        int maxElement = 0;
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s);
        }
        int min = list.get(0).length();
        for (int i = 1; i < list.size(); i++){
            if(list.get(i).length() < min)
                min = list.get(i).length();
        }
        int max = list.get(0).length();
        for (int i = 1; i < list.size(); i++){
            if(list.get(i).length() > max)
                max = list.get(i).length();
        }
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).length() == min) {
                minElement = i;
                break;
            }
        }
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).length() == max) {
                maxElement = i;
                break;
            }
        }
        if(minElement < maxElement)
            System.out.println(list.get(minElement));
        else System.out.println(list.get(maxElement));
    }
}
