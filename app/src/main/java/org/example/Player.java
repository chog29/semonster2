package org.example;

import java.util.ArrayList;
import java.util.LinkedList;

public class Player {
  private String name;
  private ArrayList<Monster> monsterDeck = new ArrayList<>();
  private LinkedList<Integer> randomNumberList;

  Player(LinkedList<Integer> randomNumberList, String playerName) {
    this.randomNumberList = randomNumberList;
    this.name = playerName;
  }

  public void drawMonsters() {
    for (int i = 0; i < 5; i++) {
      int nameNum = this.randomNumberList.pop();
      int rareNum = this.randomNumberList.pop();

      this.monsterDeck.add(new Monster(nameNum, rareNum));
    }
  }

  @Override
  public String toString() {
    StringBuilder result = new StringBuilder();

    result.append("Deck:");
    result.append(this.name);
    result.append("\n");

    for (Monster monster : this.monsterDeck) {
      result.append(monster);
    }

    return result.toString();
  }
}
