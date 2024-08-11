package com.jrferry.cards;

import com.jrferry.record.Card;

import java.util.*;

public class CardMain {

    public static void main(String[] args) {


        Card[] cardArray = new Card[13];
        Card aceOfHearts = Card.getFaceCard(Suit.HEART, 'A');
        Arrays.fill(cardArray, aceOfHearts);
        Card.printDeck(Arrays.asList(cardArray), "Ace of hearts", 1);

        List<Card> cards = new ArrayList<>(52);
        Collections.fill(cards, aceOfHearts);
        System.out.println(cards);
        System.out.println("cards.size() = " + cards.size());

        List<Card> acesOfHearts = Collections.nCopies(13, aceOfHearts);
        Card.printDeck(acesOfHearts, "Aces of Hearts", 1);

        Card kingOfClubs = Card.getFaceCard(Suit.CLUB, 'K');
        List<Card> kingsOfClubs = Collections.nCopies(13, kingOfClubs);
        Card.printDeck(kingsOfClubs, "Kings of clubs", 1);

//        Collections.addAll(cards, cardArray);
//        Card.printDeck(cards, "Card collection with aces added", 1);
//        Collections.copy(cards, kingsOfClubs);
//        Card.printDeck(cards, "Card collection with Kings copied", 1);

        cards = List.copyOf(kingsOfClubs);
        Card.printDeck(cards, "List copy of kings", 1);

        List<Card> deck = Card.getStandardDeck();
        Card.printDeck(deck);
        Collections.shuffle(deck);
        Card.printDeck(deck, "shuffled deck", 4);

        Collections.reverse(deck);
        Card.printDeck(deck, "reversed deck", 4);

        var sortingAlgorithm = Comparator.comparing(Card::rank).thenComparing(Card::suit);
        deck.sort(sortingAlgorithm);
        Card.printDeck(deck, "Standard deck sorted by rank then suit", 13);

        Collections.reverse(deck);
        Card.printDeck(deck, "reversed after sort", 13);

        List<Card> kings = new ArrayList<>(deck.subList(4, 8));
        Card.printDeck(kings, "Kings in deck", 1);

        List<Card> tens = new ArrayList<>(deck.subList(16, 20));
        Card.printDeck(tens, "Tens in deck", 1);

        int subListIndex = Collections.indexOfSubList(deck,tens);
        System.out.println("sublist index for tens = " + subListIndex);
        System.out.println("Contains = " + deck.containsAll(tens));

        boolean disjoint = Collections.disjoint(deck, tens);
        System.out.println("disjoint = " + disjoint);

        boolean disjoint2 = Collections.disjoint(kings, tens);
        System.out.println("disjoint2 = " + disjoint2);

    }
}
