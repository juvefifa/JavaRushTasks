package com.javarush.task.task09.task0905;

/* 
Там, в синих глубинах стек-трейса…
*/

public class Solution {
    public static void main(String[] args) {
        int deep = getStackTraceDepth();
    }

    public static int getStackTraceDepth() {
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        int a = elements.length;
        System.out.println(a);
        return a;
    }
}

