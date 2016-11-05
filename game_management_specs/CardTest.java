import static org.junit.Assert.*;
import org.junit.*;
import game_management.*;

public class CardTest {

  Card card;

  @Before 
  public void before() {
    card = new Card(ValueType.ACE, SuitType.SPADE);
  }

  @Test
  public void canGetValueType() {
    assertEquals(ValueType.ACE, card.getValue());
  }

  @Test
  public void canGetSuitType() {
    assertEquals(SuitType.SPADE, card.getSuit());
  }

  @Test 
  public void canSetValueType() {
    card.setValue(ValueType.EIGHT);
    assertEquals(ValueType.EIGHT, card.getValue());
  }

  @Test 
  public void canSetSuitType() {
    card.setSuit(SuitType.HEART);
    assertEquals(SuitType.HEART, card.getSuit());
  }




}