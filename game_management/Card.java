package game_management;

public class Card {

  private ValueType value;
  private SuitType suit;

  public Card(ValueType value, SuitType suit) {
    this.value = value;
    this.suit = suit;
  }

  public ValueType getValue() {
    return this.value;
  }

  public SuitType getSuit() {
    return this.suit;
  }

  public void setValue(ValueType value) {
    this.value = value;
  }

  public void setSuit(SuitType suit) {
    this.suit = suit;
  }

  public int getCardNumber() {
    return this.value.getNumber();
  }



}