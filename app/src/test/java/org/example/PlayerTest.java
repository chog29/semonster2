package org.example;

import java.util.LinkedList;

import org.junit.Assert;
import org.junit.Test;

public class PlayerTest {
  @Test
  public void testDrawMonsters() {
    LinkedList<Integer> randomNumberList = new LinkedList<>();

    randomNumberList.add(0);
    randomNumberList.add(0);

    randomNumberList.add(1);
    randomNumberList.add(1);

    randomNumberList.add(2);
    randomNumberList.add(3);

    randomNumberList.add(3);
    randomNumberList.add(2);

    randomNumberList.add(4);
    randomNumberList.add(1);

    Player player = new Player(randomNumberList, "user");
    player.drawMonsters();

    String expected = "Deck:user\n"
        + "スライム:レア度[0]\n"
        + "グロンプ:レア度[1]\n"
        + "マークウルフNeo:レア度[3]\n"
        + "クルーグ:レア度[2]\n"
        + "ラフター:レア度[1]\n";

    Assert.assertEquals(expected, player.toString());
  }
}
