package com.jrferry.datastructures.arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExamples {

    public static void main(String[] args) {
        String[] items = {"apples", "oranges", "bananas"};

        List<String> list = List.of(items);
        ArrayList<String> nextList = new ArrayList<>(List.of("cheese", "mustard"));
        System.out.println(list);
        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("yoghurt");

        groceries.addAll(nextList);
        groceries.add("yoghurt");
        System.out.println(groceries);
        groceries.remove("yoghurt");
        System.out.println(groceries);
    }
}
