package com.jrferry.problems;

import java.util.HashMap;
import java.util.Map;

public class SortHashMapByItsValue {

    public static void main(String[] args) {
        Map<Character, Integer> setup = new HashMap<>();
        setup.put('A', 3);
        setup.put('B', 1);
        setup.put('C', 5);
        setup.put('D', 2);
        setup.put('E', 4);

        /*
        expected answer:
        {B,1},
        {D,2},
        {A,3},
        {E,4},
        {C,5}
         */

        char[] myIndexedArray = new char[setup.size()]; // 0 -4

        for (Map.Entry<Character, Integer> e: setup.entrySet()) {
            myIndexedArray[e.getValue() - 1] = e.getKey();
        }

        Map<Integer, Character> sortedByValueMap = new HashMap<>();
        for (int i =0; i < myIndexedArray.length; i++) {
            sortedByValueMap.put(i + 1, myIndexedArray[i]);
        }

        System.out.println("Completed");


    }
}
