package com.jrferry.datastructures.linkedlists;

import java.util.*;

;
public class Challenge {
    static List<TownsFromSydney> townsFromSydneyList = new LinkedList<>();
    static ListIterator<TownsFromSydney> listIterator;

    public static void main(String[] args) {
        populateList();
        userInput();
    }

    private static void userInput() {
        String answer = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Available actions (Select word or letter");
        System.out.println("(F)orward");
        System.out.println("(B)ackward)");
        System.out.println("(L)ist Places)");
        System.out.println("(Q)uit)");

        do {
            answer = scanner.nextLine();
            switch (answer) {
                case "F":
                   iterateForward();
                    break;
                case "B":
                    iterateBackward();
                    break;
                case "L":
                    printList();
                    break;
                default:
                    System.out.println("not a valid input");
            }
        }
        while (!answer.equals("Q"));

    }

    private static void iterateForward() {
        if (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
    }

    private static void iterateBackward() {
        if (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }

    public static void populateList() {
        townsFromSydneyList.add(new TownsFromSydney("Sydney", 0));
        townsFromSydneyList.add(new TownsFromSydney("Adelaide", 1374));
        townsFromSydneyList.add(new TownsFromSydney("Alice Springs", 2771));
        townsFromSydneyList.add(new TownsFromSydney("Brisbane", 917));
        townsFromSydneyList.add(new TownsFromSydney("Darwin", 3972));
        townsFromSydneyList.add(new TownsFromSydney("Melbourne", 877));
        townsFromSydneyList.add(new TownsFromSydney("Perth", 3923));
        townsFromSydneyList.sort(null);
        System.out.println(townsFromSydneyList);
        listIterator = townsFromSydneyList.listIterator();
    }

    private static void printList() {
        System.out.println(townsFromSydneyList);
    }
}
