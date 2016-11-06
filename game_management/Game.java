package game_management;
import game_management.*;
import java.util.*;

public class Game{

ArrayList<Player> players = new ArrayList<Player>();
private static ArrayList<Card> deck = new ArrayList<Card>();

public void addPlayer(Player player) {
  players.add(player);
}
 
public int playerCount() {
  return players.size();
}



}

