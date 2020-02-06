package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> listAll = new ArrayList<Integer>();
        ArrayList<Integer> x3 = new ArrayList<Integer>();
        ArrayList<Integer> x2 = new ArrayList<Integer>();
        ArrayList<Integer> other = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            String s = reader.readLine();
            int a = Integer.parseInt(s);
            listAll.add(a);
        }
        for(int i = 0; i < listAll.size(); i++){
            if(listAll.get(i)%3 == 0 && listAll.get(i)%2 == 0){
                x3.add(listAll.get(i));
                x2.add(listAll.get(i));
            }
            else {
                if (listAll.get(i) %3 == 0)
                    x3.add(listAll.get(i));
                else if (listAll.get(i) %2 == 0)
                    x2.add(listAll.get(i));
                else other.add(listAll.get(i));
            }
        }
        printList(x3);
        printList(x2);
        printList(other);
    }

    public static void printList(ArrayList<Integer> list) {


        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
