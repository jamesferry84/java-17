package com.jrferry.comparisons;

import java.util.Arrays;
import java.util.Random;

public class ComparableExample {

    public static void main(String[] args) {
        Integer five = 5;
        Integer[] others = {0,5,10,-50,50};

        for (Integer i : others) {
            int val = five.compareTo(i);
            System.out.printf("%d %s %d: compareTo= %d%n", five, (val == 0 ? "==" : (val < 0) ? "<" : ">"), i, val);
        }
        Student testStudent = new Student("Test");
        Student[] students = {new Student("James"), new Student("Wenting"), testStudent};
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
        System.out.println("result = " + testStudent.compareTo(new Student("Hugh")));

    }
}

class Student implements Comparable<Student> {
    String name;
    private static int LAST_ID = 1000;
    private static Random random = new Random();

    private int id;

    protected double gpa;

    public Student(String name) {
        this.name = name;
        id = LAST_ID++;
        gpa = random.nextDouble(1.0, 4.0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", gpa=" + gpa +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return Integer.valueOf(id).compareTo(Integer.valueOf(o.id));
    }

    //    @Override
//    public int compareTo(Object o) {
//        Student other = (Student)o;
//        return name,compareTo(other.name);
//    }
}
