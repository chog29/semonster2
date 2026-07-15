package org.example;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Random;

public class SeMonsterGame {
  private Map<String, Player> players = new HashMap<>();
  private Random random;

  public SeMonsterGame() {
    this.random = new Random();
  }

  public SeMonsterGame(Random random) {
    this.random = random;
  }

  public void addPlayer(String playerName) {
    LinkedList<Integer> randomNumberList = new LinkedList<>();
    for (int i = 0; i < 16; i++) {
      randomNumberList.add(random.nextInt(5));
    }
    Player player = new Player(randomNumberList, playerName);
    this.players.put(playerName, player);
  }

  public void draw(String playerName) {
    Player player = this.players.get(playerName);
    if (player != null) {
      player.drawMonsters();
    }
  }

  public Player getPlayer(String playerName) {
    return this.players.get(playerName);
  }
}
