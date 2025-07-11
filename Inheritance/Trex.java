package Inheritance;

public class Trex extends Dinosaur {

  public Trex() {
    super("meat", "trex");
  }

  public String getType() {
    return dinoType;
  }

  public String attack() {
    return "rawr I am going to get you!";
  }
}
