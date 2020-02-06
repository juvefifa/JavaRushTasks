package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        List<Integer> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            int a = Integer.parseInt(reader.readLine());
            list.add(a);
        }
        List<Integer> counter = new ArrayList<>();
        int count = 1;
        for (int i = 0; i < list.size() - 1; i++) {

            if ((int) list.get(i) == (int) list.get(i + 1)) {
                count++;
            } else {
                counter.add(count);
                count = 1;
            }
        }
        counter.add(count);
        //System.out.println(counter);

        System.out.println(Collections.max(counter));


    }
}