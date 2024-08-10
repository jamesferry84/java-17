package com.jrferry.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortByLastDigit {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(21);
        nums.add(34);
        nums.add(19);
        nums.add(12);

        List<String> strings = new ArrayList<>();
        strings.add("howdy");
        strings.add("congratulations");
        strings.add("howdy");
        strings.add("buddy");
        strings.add("time");
        strings.add("and");

        Collections.sort(nums);

        System.out.println(nums);

        DigitSort digitSort = new DigitSort();
        System.out.println(digitSort.getLastDigit(nums.get(0)));
        System.out.println(digitSort.getLastDigit(nums.get(1)));
        System.out.println(digitSort.getLastDigit(nums.get(2)));
        System.out.println(digitSort.getLastDigit(nums.get(3)));

        Collections.sort(nums, digitSort);

        System.out.println("Custom sort: " + nums);

        Comparator<String> stringLengthComparator = (o1, o2) -> {
            return o1.length() == o2.length() ? 0 : o1.length() < o2.length() ? -1: 1;
        };

        Collections.sort(strings, stringLengthComparator);
        System.out.println(strings);



    }

}

class DigitSort implements Comparator<Integer> {


    @Override
    public int compare(Integer o1, Integer o2) {
        int num1 = getLastDigit(o1);
        int num2 = getLastDigit(o2);
        return Integer.compare(num1, num2);
    }

    public int getLastDigit(int num) {
        while (num / 10 != 0) {
            num = num % 10;
        }
        return num;
    }
}
