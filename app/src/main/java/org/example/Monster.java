package org.example;

public class Monster {
  private String name;
  private int rare;

  Monster(int nameNum, int rareNum) {
    this.name = this.summonMonster(nameNum);
    this.rare = rareNum;

    if (this.rare >= 3) {
      this.name = this.name + "Neo";
    }
  }

  String summonMonster(int num) {
    String monsters[] = { "スライム", "グロンプ", "マークウルフ", "クルーグ", "ラプター" };
    return monsters[num];
  }

  @Override
  public String toString() {
    return this.name + ":レア度[" + this.rare + "]\n";
  }
}
