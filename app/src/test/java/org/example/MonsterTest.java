package org.example;

import org.junit.Assert;
import org.junit.Test;

public class MonsterTest {
  @Test
  public void testSummonMonster1() {
    Monster monster = new Monster(0, 0);
    Assert.assertEquals("スライム:レア度[0]\n", monster.toString());
  }

  @Test
  public void testSummonMonster2() {
    Monster monster = new Monster(1, 1);
    Assert.assertEquals("グロンプ:レア度[1]\n", monster.toString());
  }

  @Test
  public void testSummonMonster3() {
    Monster monster = new Monster(2, 3);
    Assert.assertEquals("マークウルフNeo:レア度[3]\n", monster.toString());
  }

  @Test
  public void testSummonMonster4() {
    Monster monster = new Monster(3, 2);
    Assert.assertEquals("クルーグ:レア度[2]\n", monster.toString());
  }

  @Test
  public void testSummonMonster5() {
    Monster monster = new Monster(4, 1);
    Assert.assertEquals("ラフター:レア度[1]\n", monster.toString());
  }
}
