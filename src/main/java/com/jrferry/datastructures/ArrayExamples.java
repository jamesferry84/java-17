package com.jrferry.datastructures;

public class ArrayExamples {

    int[] anonamousArray = {1,2,3,4,5};
    int[] emptyDefaultInitializedArray = new int[5]; // same as {0, 0, 0, 0, 0}

    public void loopAndPrintArray(int[] arrayToPrint) {
        for (int number : arrayToPrint) {
            System.out.println("Value is: " + number);
        }
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int number : anonamousArray) {
            sb.append(" " + number);
        }
        sb.append("]");
        return sb.toString();
    }

}
