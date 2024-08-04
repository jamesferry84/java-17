package com.jrferry.datastructures;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class ArrayExamplesTest {

    @Test
    void loopAndPrintArray() {
        int[] testArray = {1,2,3,4,5};
        ArrayExamples arrayExamples = new ArrayExamples();
        System.out.println(Arrays.toString(testArray));
    }

    @Test
    void sortArrayDescending() {
        Random random = new Random();
        int[] integerRandomSizedArray = new int[random.nextInt(10)];
        for (int i =0; i < integerRandomSizedArray.length; i++) {
            integerRandomSizedArray[i] = random.nextInt(0, 50);
        }
        System.out.println(Arrays.toString(integerRandomSizedArray));
        Arrays.sort(integerRandomSizedArray);
        System.out.println(Arrays.toString(integerRandomSizedArray));
    }
}