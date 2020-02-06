package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("qw", 111);
        map.put("we", 222);
        map.put("er", 333);
        map.put("rt", 444);
        map.put("ty", 555);
        map.put("yu", 666);
        map.put("ui", 777);
        map.put("io", 888);
        map.put("op", 999);
        map.put("as", 100);

        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {

        map.entrySet().removeIf(entry -> entry.getValue() < 500);

    }

    public static void main(String[] args) {

    }
}