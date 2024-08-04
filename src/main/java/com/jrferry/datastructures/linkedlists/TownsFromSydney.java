package com.jrferry.datastructures.linkedlists;

public record TownsFromSydney(String town, Integer distance) implements Comparable<TownsFromSydney> {

    @Override
    public int compareTo(TownsFromSydney o) {
        return distance.compareTo(o.distance);
    }
}
