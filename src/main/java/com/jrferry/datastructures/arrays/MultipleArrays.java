package com.jrferry.datastructures.arrays;

import java.util.Arrays;

public class MultipleArrays {

    public static void main(String[] args) {
        int[][] twoDimensionArray = new int[4][4];
        System.out.println(Arrays.toString(twoDimensionArray));
        System.out.println("length: " + twoDimensionArray.length);

        for (int[] outer : twoDimensionArray) {
            System.out.println(Arrays.toString(outer));
        }

        for (int i =0; i < twoDimensionArray.length; i++) {
            var innerArray = twoDimensionArray[i];
            for (int j = 0; j < innerArray.length; j++) {
                twoDimensionArray[i][j] = (i * 10) + (j + 1);
//                System.out.print(twoDimensionArray[i][j] + " ");
            }
//            System.out.println();
        }

//        for (var outer : twoDimensionArray) {
//            for (var element : outer) {
//                System.out.print(element + " ");
//            }
//            System.out.println();
//        }
        System.out.println(Arrays.deepToString(twoDimensionArray));

    }
}
