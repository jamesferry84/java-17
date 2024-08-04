package com.jrferry;

import com.jrferry.record.Student;

public class Starter {

    public static void main(String[] args) {
        System.out.println("Testing");

        for (int i = 0; i <= 5; i++) {
            Student s = new Student("id-" + i, "james-" + i);
            System.out.println("id is: " + s.id());
            System.out.println(s);
        }
    }
}
