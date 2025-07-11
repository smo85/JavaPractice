package Interfaces;

class Enemy extends Character {
  Integer x;
  Integer y;

  public Enemy(Integer x, Integer y, String name, String type, Integer health) {
    super(name, type, health);
    this.x = x;
    this.y = y;
  }

  public void move() {
    this.x += 1;
    this.y += 1;
  }
}
