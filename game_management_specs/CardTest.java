import static org.junit.Assert.*;
import org.junit.*;
import game_management.*;

public class CardTest {

  Card card;

  @Before 
  public void before() {
    card = new Card(ValueType.ACE, SuitType.SPADES);
  }

  @Test
  public void canGetValueType() {
    assertEquals(ValueType.ACE, card.getValue());
  }

  @Test
  public void canGetSuitType() {
    assertEquals(SuitType.SPADES, card.getSuit());
  }

  @Test 
  public void canSetValueType() {
    card.setValue(ValueType.EIGHT);
    assertEquals(ValueType.EIGHT, card.getValue());
  }

  @Test 
  public void canSetSuitType() {
    card.setSuit(SuitType.HEARTS);
    assertEquals(SuitType.HEARTS, card.getSuit());
  }

  @Test
  public void canGetCardNumber() {
    assertEquals(11, card.getCardNumber());
  }

  @Test
  public void canPrintCard() {
    assertEquals("ACE of SPADES", card.toString());
  }




}