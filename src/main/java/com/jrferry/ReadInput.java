package com.jrferry;

import java.util.Scanner;

public class ReadInput {

    public static void main(String[] args) {
        int currentYear = 2024;
        try {
            System.out.println(getInputFromScanner(currentYear));
        } catch (NullPointerException e) {
            System.out.println(getInputFromScanner(currentYear));
        }
    }

    public static String getInputFromScanner(int currentyear) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name: ");
        String name = scanner.nextLine();

        System.out.println("Year of birth? : ");
        String yearOfBirth = scanner.nextLine();
        int age = currentyear - Integer.parseInt(yearOfBirth);

        return "You are " + age + " years old" ;
    }
}
