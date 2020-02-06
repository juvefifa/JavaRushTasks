package com.javarush.task.task08.task0802;

/* 
Map из 10 пар
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Map<String, String> ovoschi = new HashMap<String, String>();
        ovoschi.put("арбуз", "ягода");
        ovoschi.put("банан", "трава");
        ovoschi.put("вишня", "ягода");
        ovoschi.put("груша", "фрукт");
        ovoschi.put("дыня", "овощ");
        ovoschi.put("ежевика", "куст");
        ovoschi.put("жень-шень", "корень");
        ovoschi.put("земляника", "ягода");
        ovoschi.put("ирис", "цветок");
        ovoschi.put("картофель", "клубень");

        for(Map.Entry<String, String> pair : ovoschi.entrySet())
        {
            String key = pair.getKey();                      //ключ
            String value = pair.getValue();                  //значение
            System.out.println(key + " - " + value);
        }
    }
}