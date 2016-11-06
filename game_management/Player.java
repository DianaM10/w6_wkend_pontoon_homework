package game_management;
import game_management.*;
import java.util.*;

public class Player{

private String name;
ArrayList<Card> hand = new ArrayList<Card>();


public Player(String name){
  this.name = name;
}

public String getName(){
  return this.name;
}

public void setHand(){
  this.hand = new ArrayList<Card>();
}

public ArrayList<Card> getHand() {
  return this.hand;
}

public int numberOfCards() {
  return this.hand.size();
}

public void addCard(Card card) {
  this.hand.add(card);
}












}