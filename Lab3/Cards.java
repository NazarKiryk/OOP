package com.tasks3.carddeck; 
public class Deck { 
private Card[] deck; 
private int currentCardNumber;

public Deck(){
    deck = new Card[Suit.values.length * Rank.values.length];
    currentCardNumber = deck.length - 1;
    int k = 0;
    for(int i = 0; i < Suit.values.length; i++){
        for(int j = 0; j < Rank.values.length; j++) {
            deck[k] = new Card(Rank.values[j], Suit.values[i]);
            k++;
        }
    }
}

public void shuffle() {
    if(currentCardNumber >= 0){
        Card[] tempDeck = new Card[1];
        for(int k = 0; k < currentCardNumber + 1; k++){
            int a = random(currentCardNumber + 1);
            tempDeck[0] = deck[k];
            deck[k] = deck[a];
            deck[a] = tempDeck[0];
        }
    }
}

public void order() {
    Card[] tempDeck = new Card[deck.length];
    int n = 0;
    for(int i = 0; i < Suit.values.length; i++) {
        for(int j = 0; j < Rank.values.length; j++) {
            for(int k = 0; k <= currentCardNumber; k++){
                if(deck[k].getSuit().getName().equals(Suit.values[i].getName()) && deck[k].getRank().getName().equals(Rank.values[j].getName())) {
                    tempDeck[n] = deck[k];
                    n++;
                }
            }
        }
    }
    deck = tempDeck;
}

public boolean hasNext() {
    return currentCardNumber >= 0;
}

public Card drawOne() {
    if(hasNext()){
        return deck[currentCardNumber--];
    }
    return null;
} 

public static int random(int deckLength){
    return (int)(Math.random() * deckLength);
}
}
      