import static org.junit.Assert.*;
import org.junit.*;
import game_management.*;

public class DeckTest {

  
  Deck deck;
 

  @Before 
  public void before() {
    this.deck = new Deck();
  }


  @Test
  public void hasDeckOf52() {
    assertEquals(52, deck.deckSize());
  }


  
}