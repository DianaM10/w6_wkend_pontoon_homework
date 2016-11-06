package game_management;
import game_management.*;
import java.util.*;

public class Deck {

private ArrayList<Card> deck;

  public Deck() {
    this.deck = new ArrayList<Card>();
    for (ValueType value:ValueType.values()) {
      for (SuitType suit:SuitType.values()){
        deck.add(new Card(value,suit));
      }
    }
  } 

  public int deckSize() {
    return this.deck.size();
  }

  public void shuffleDeck() {
    Collections.shuffle(deck);
  }

  public void deal() {
    deck.remove(0);
    deck.remove(0);
  }


}

  