package com.jrferry.cards;

import com.jrferry.record.Card;

import java.util.*;

/*
High Card Draw
 */
public class MyCardGame {

    static List<Card> deck = new ArrayList<>(52);
    int[] numberCardOptions = {2, 3, 4, 5, 6, 7, 8, 9, 10};
    char[] faceCardOptions = {'J', 'Q', 'K', 'A'};


    public static void main(String[] args) {
        startGame();
    }

    private static void startGame() {
        deck = Card.getStandardDeck();

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many players");
        int players = Integer.parseInt(scanner.nextLine()); //in reality this would have input checks for number etc
        int currentPlayer = 0;
        List<Card> playerScores = new ArrayList<>(players);
        while (currentPlayer < players) {
            Card card = drawCard();
            playerScores.add(card);
            currentPlayer++;
        }

        for (int i = 0; i < playerScores.size(); i++) {
            System.out.println("Player[" + i + "] has score: " + playerScores.get(i));
        }

        var cardRanking = Comparator.comparing(Card::rank).thenComparing(Card::suit);

        Card winningCard = Collections.max(playerScores, cardRanking);
        playerScores.sort(cardRanking);
        System.out.println("Winning card = " + winningCard);
        var winner = Collections.binarySearch(playerScores, winningCard, cardRanking);
        System.out.println("Winning player = " + winner);
        System.out.println(playerScores.get(winner));
        deck.sort(cardRanking);
        Card.printDeck(deck);
        System.out.println(deck.size());
        System.out.println("Putting cards back");
        for (Card c : playerScores) {
            putCardsBack(c);
        }
        deck.sort(cardRanking);
        Card.printDeck(deck);
        System.out.println(deck.size());
    }

    private static void putCardsBack(Card card) {
        deck.add(card);
    }

    private static Card drawCard() {
        Random random = new Random();
        int randomIndex = random.nextInt(deck.size());
        Card card = deck.get(random.nextInt(deck.size()));
        deck.remove(randomIndex);
        return card;
    }
}
