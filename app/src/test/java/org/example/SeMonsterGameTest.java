package org.example;

import org.junit.Assert;
import org.junit.Test;
import java.util.Random;

public class SeMonsterGameTest {
  @Test
  public void testAddPlayerAndDraw() {
    Random fixedRandom = new Random(0);
    SeMonsterGame game = new SeMonsterGame(fixedRandom);
    String playerName = "TestPlayer";

    game.addPlayer(playerName);
    Player player = game.getPlayer(playerName);

    String expectedBeforeDraw = "Deck:TestPlayer HP:100\n";
    Assert.assertEquals(expectedBeforeDraw, player.toString());

    game.draw(playerName);

    String expectedAfterDraw = "Deck:TestPlayer HP:100\n"
        + "スライムNeo:レア度[3]\n"
        + "ラプター:レア度[2]\n"
        + "スライムNeo:レア度[3]\n"
        + "グロンプ:レア度[1]\n"
        + "ラプターNeo:レア度[4]\n"
        + "マークウルフ:レア度[2]\n"
        + "クルーグ:レア度[2]\n"
        + "スライムNeo:レア度[4]\n";

    Assert.assertEquals(expectedAfterDraw, player.toString());
  }
}
