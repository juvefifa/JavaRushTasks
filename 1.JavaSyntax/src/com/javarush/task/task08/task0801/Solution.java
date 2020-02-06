package com.javarush.task.task08.task0801;

/* 
Set из растений
*/

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Set<String> ovoschi = new HashSet<String>();
        ovoschi.add("арбуз");
        ovoschi.add("банан");
        ovoschi.add("вишня");
        ovoschi.add("груша");
        ovoschi.add("дыня");
        ovoschi.add("ежевика");
        ovoschi.add("женьшень");
        ovoschi.add("земляника");
        ovoschi.add("ирис");
        ovoschi.add("картофель");

        for (String text : ovoschi){
            System.out.println(text);
        }
    }
}