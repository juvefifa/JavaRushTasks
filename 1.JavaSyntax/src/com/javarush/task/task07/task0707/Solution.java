package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String > list = new ArrayList<String>();
        list.add("first");
        list.add("sdsd");
        list.add("sdsdsdsd");
        list.add("dfd");
        list.add("fgfgfgf");

        System.out.println(list.size());

        for (int i = 0; i < 5; i++)
            System.out.println(list.get(i));
    }
}
