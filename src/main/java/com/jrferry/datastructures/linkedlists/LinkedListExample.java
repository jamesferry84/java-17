package com.jrferry.datastructures.linkedlists;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {
//        List<String> placesToVisit = new LinkedList<>();
        var placesToVisit = new LinkedList<String>();

        placesToVisit.add("Sydney");
        placesToVisit.add(0, "Canberra");
        System.out.println(placesToVisit);
        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);
        removeElements(placesToVisit);
        System.out.println(placesToVisit);
        testIterator(placesToVisit);
    }

    private static void addMoreElements(LinkedList<String> list) {
        list.addFirst("Darwin");
        list.addLast("Stirling");
        //queue methods
        list.offer("Melbourne");
        list.offerFirst("Falkirk");
        //stack methods
        list.push("Glasgow");
        list.push("Edinburgh");
        list.push("London");
        list.push("Manchester");
        list.push("Florida");
    }

    private static void removeElements(LinkedList<String> list) {

        String s1 = list.remove();
        System.out.println(s1 + " was removed");

        String s2 = list.removeFirst();
        System.out.println(s2 + " was removed");

        String s3 = list.removeLast();
        System.out.println(s3 + " was removed");

        //queue / dequue poll mothods

        String p1 = list.poll();
        System.out.println(p1 + " was removed");

        String p2 = list.pollFirst();
        System.out.println(p2 + " was removed");

        String p3 = list.pollLast();
        System.out.println(p3 + " was removed");

        String p4 = list.pop();
        System.out.println(p4 + " was removed");

    }

    private static void testIterator(LinkedList<String> list) {
        var iterator = list.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println(list);
    }
}
