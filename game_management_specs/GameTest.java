import static org.junit.Assert.*;
import org.junit.*;
import game_management.*;

public class GameTest {

  Player player1;
  Player player2;
  Deck deck;
  Game game;

  @Before
  public void before(){
    game = new Game();
    player1 = new Player("Jason");
    player2 = new Player("Barbie");
    deck = new Deck();
  }

  @Test
  public void canAddPlayer() {
    game.addPlayer(player1);
    assertEquals(1, game.playerCount());
  }

  @Test //why does this test pass?
  public void dealsCards() {
    game.addPlayer(player1);
    game.addPlayer(player2);
    deck.deal();
    assertNotNull(player1.getHand());
    assertNotNull(player2.getHand());
  }





  }