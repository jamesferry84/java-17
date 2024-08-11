package com.jrferry.record;

import com.jrferry.cards.Suit;

import java.util.ArrayList;
import java.util.List;

public record Card(Suit suit, String face, int rank) {


    public static Card getNumericCard(Suit suit, int number) {
        if (number > 1 && number < 11) {
            return new Card(suit, String.valueOf(number), number - 2);
        }
        System.out.println("Not a valid card number");
        return null;
    }

    public static Card getFaceCard(Suit suit, char face) {


        switch (face) {
            case 'A':
                return new Card(suit, String.valueOf(face), 12);
            case 'K':
                return new Card(suit, String.valueOf(face), 11);
            case 'Q':
                return new Card(suit, String.valueOf(face), 10);
            case 'J':
                return new Card(suit, String.valueOf(face), 9);
            default:
                System.out.println("Not a valid face card");
                return null;
        }
    }

    public static List<Card> getStandardDeck() {
        List<Card> deckOfCards = new ArrayList<>(52);
        //for each suit create card 2,3,4,5,6,7,8,9,10,J,Q,K,A
        for (Suit s : Suit.values()) {
            for (int i = 2; i <= 10; i++) {
                deckOfCards.add(getNumericCard(s, i));
            }

            for (char c : new char[]{'J', 'Q', 'K', 'A'}) {
                deckOfCards.add(getFaceCard(s, c));
            }
        }
        return deckOfCards;
    }

    public static void printDeck(List<Card> deckOfCards, String description, int rowCount) {
        System.out.println("----------------------");
        if (description != null) {
            System.out.println(description);
        }

        int cardsInRow = deckOfCards.size() / rowCount;
        for (int i = 0; i < rowCount; i++) {
            int startIndex = i * cardsInRow;
            int endIndex = startIndex + cardsInRow;
            deckOfCards.subList(startIndex, endIndex).forEach(c -> System.out.print(c + " "));
            System.out.println();
        }

    }

    public static void printDeck(List<Card> cards) {
        printDeck(cards, "Current Deck", 4);
    }


    @Override
    public String toString() {
        int index = face.equals("10") ? 2 : 1;
        String faceString = face.substring(0, index);
        return faceString  + suit.asciiCode + "(" + rank + ")";
    }
}
