package com.jrferry.datastructures.arraylists;

import java.util.*;

public class Challenge {

    /**
     * Available actions:
     * 0 - to shutdown
     * 1 - to add item(S) to list (comma delimited list)
     * 2 - to remove any items (comma delimited list)
     * <p>
     * Enter a number for which action you want to do:
     * <p>
     * Scanner to input 0 1 or 2
     * <p>
     * Use a grocery list which will be an ArrayList
     * --add, remove, check if exists, print sorted list
     * <p>
     * DO NOT ALLOW DUPES
     *
     * @param args
     */

    static int[] validAnswers = {0, 1, 2};
    static List<String> groceryItems = new ArrayList<>();

    public static void main(String[] args) {
        int result = userInput();
        System.out.println(result);
    }

    public static String[] inputGroceryList() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter items delimited by ,");
        String result = scanner.next();
        return result.split(",");
    }

    public static int userInput() {
        int answer = -1;
        do {
            try {

                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("* Available actions:\n" +
                        "     * 0 - to shutdown\n" +
                        "     * 1 - to add item(S) to list (comma delimited list)\n" +
                        "     * 2 - to remove any items (comma delimited list)");
                System.out.println(stringBuilder);
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter a number for which action you want to do: ");
                answer = Integer.parseInt(scanner.next());
                if (Arrays.binarySearch(validAnswers, answer) < 0) {
                    throw new UnsupportedOperationException("User input should be 0 ,1 or 2");
                }
                applyChoice(answer);
                groceryItems.sort(Comparator.naturalOrder());
                System.out.println(groceryItems);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (answer != 0 && Arrays.binarySearch(validAnswers, answer) > 0);
        return answer;
    }

    public static void applyChoice(int choice) {
        switch (choice) {
            case 0:
                System.out.println("Exiting");
                break;
            case 1:
                addGroceryItems(inputGroceryList());
                break;
            case 2:
                removeGroceryItems(inputGroceryList());
                break;
            default:
                System.out.println("default");
                break;
        }
    }

    public static void addGroceryItems(String... items) {
        for (String item : items) {
            if (!checkItemExists(item)) {
                groceryItems.add(item);
            }
        }
    }

    public static void removeGroceryItems(String... items) {
        for (String item : items) {
            groceryItems.remove(item);
        }
    }

    public static boolean checkItemExists(String item) {
        return groceryItems.contains(item);
    }
}
