package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static Set<Integer> createSet() {
        Set<Integer> newSet = new HashSet<>();
        for(int i = 0; i < 20; i++){
            newSet.add(i);
        }
        return newSet;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        // напишите тут ваш код
        Iterator<Integer> i = set.iterator();
        while (i.hasNext()) {
            if(i.next() > 10){
            i.remove();
            }
        }
        return null;
    }

    public static void main(String[] args) {



    }
}
