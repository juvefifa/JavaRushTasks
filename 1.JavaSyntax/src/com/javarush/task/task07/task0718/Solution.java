package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<String >();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int  i = 0; i < 10; i++)
        {
            String s = reader.readLine();
            list.add(s);
        }
        for (int i=0; i<list.size()-1; i++) {
            if (list.get(i).length()>list.get(i+1).length()) {
                System.out.println(i+1);
                break;
            }
        }

/*        int count = 1;
        int a = list.get(0).length();
        for (int i = 1; i < 10; i++)
        {
            if (list.get(i).length() < a)
                count++;
            else
                break;
        }
        if (count < list.size())
        System.out.println(count);

 */
    }
}