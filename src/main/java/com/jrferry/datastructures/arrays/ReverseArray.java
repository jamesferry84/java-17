package com.jrferry.datastructures.arrays;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String... args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(array));
        reverse(array);
        System.out.println(Arrays.toString(array));
    }

    public static void reverse(int[] arrayToReverse) {
        for (int i = 0, j = arrayToReverse.length - 1 ; i < arrayToReverse.length / 2; i++, j--) {
            int temp = arrayToReverse[i];
            arrayToReverse[i] = arrayToReverse[j];
            arrayToReverse[j] = temp;
        }
    }
}
