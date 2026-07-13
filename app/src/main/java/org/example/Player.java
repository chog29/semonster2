package org.example;

import java.util.ArrayList;
import java.util.LinkedList;

public class Player {
  private String name;
  private int hp;
  private ArrayList<Monster> monsterDeck = new ArrayList<>();
  private LinkedList<Integer> randomNumberList;

  Player(LinkedList<Integer> randomNumberList, String playerName) {
    this.randomNumberList = randomNumberList;
    this.name = playerName;
    this.hp = 100;
  }

  public void drawMonsters() {
    for (int i = 0; i < 8; i++) {
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
    result.append(" HP:"); // 出力にHPを追加
    result.append(this.hp);
    result.append("\n");

    for (Monster monster : this.monsterDeck) {
      result.append(monster);
    }

    return result.toString();
  }
}
