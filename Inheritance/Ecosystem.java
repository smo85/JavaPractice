package Inheritance;

public class Ecosystem {
  private String name;
  private Dinosaur dinosaur;

  public Ecosystem(String name, Dinosaur dinosaur) {
    this.name = name;
    this.dinosaur = dinosaur;
  }

  public Dinosaur getDinosaur() {
    return dinosaur;
  }
}
