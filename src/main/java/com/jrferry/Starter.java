package com.jrferry;

import java.util.Arrays;
import java.util.Scanner;

public class Starter {

    public static void main(String... args) {
        int[] numbers = readIntegers();
        int lowestNumber = findMin(numbers);
        System.out.println(lowestNumber);
    }

    private static int[] readIntegers() {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        String[] numberText = text.split(",");
        int[] numberArray = new int[numberText.length];
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = Integer.parseInt(numberText[i]);
        }
        return  numberArray;
    }

    private static int findMin(int... numbers) {
        return Arrays.stream(numbers).min().orElse(Integer.MIN_VALUE);
    }

    private static void printText(String... textList) {
        for (String t : textList) {
            System.out.println(t);
        }
    }
}
