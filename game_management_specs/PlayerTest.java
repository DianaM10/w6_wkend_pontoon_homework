import static org.junit.Assert.*;
import org.junit.*;
import game_management.*;

public class PlayerTest {

  Player player1;
  Player player2;
  Hand hand1;
  Hand hand2;
  Card card1;
  Card card2;
  Card card3;
  Card card4;

  @Before
  public void before(){
    player1 = new Player("Jason");
    player2 = new Player("Barbie");
    // hand1 = new ArrayList<Card>();
    // hand2 = new ArrayList<Card>();
    card1 = new Card(ValueType.ACE, SuitType.SPADES);
    card2 = new Card(ValueType.NINE, SuitType.DIAMONDS);
    card3 = new Card(ValueType.SIX, SuitType.HEARTS);
    card4 = new Card(ValueType.SEVEN, SuitType.CLUBS);
    player1.setHand();

  }

  @Test
  public void hasName(){
    assertEquals("Jason", player1.getName());
    assertEquals("Barbie", player2.getName());
  }

  @Test 
  public void handStartsEmpty() {
    assertEquals(0, player2.handNumberOfCards());

  }

}















