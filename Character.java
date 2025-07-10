public abstract class Character {
  String name;
  String type;
  Integer health;

   Character(String name, String type, Integer health) {
    this.name = name;
    this.health = health;
    this.type = type;
  }

  public abstract void move();

  @Override
  public String toString() {
    String template = "%s: type=%s, health=%d";
    return template.formatted(name, type, health);
  }
}
