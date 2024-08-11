package com.jrferry.cards;

public enum Suit {

    CLUB((char)9827),
    DIAMOND((char)9830),
    HEART((char)9829),
    SPADE((char) 9824);

    public final char asciiCode;

    Suit(char asciiCode) {
        this.asciiCode = asciiCode;
    }
}
