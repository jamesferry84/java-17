package com.jrferry.lambdas;

import java.util.Arrays;
import java.util.function.Consumer;

public class Problems {

    public static void main(String[] args) {
        //split string
        String sentence = "This is a sentence";
        Consumer<String> words = (String s) -> {
            Arrays.asList(sentence.split(" ")).forEach(System.out::println);

        };

        words.accept(sentence);
    }
}
