package Interfaces;

public class Gazelle implements Herbivore {
  @Override
  public String makeSound() {
    return "honk honk";
  }

  @Override
  public String eat() {
    return "grasses";
  }

  @Override
  public String runFromPredator() {
    return "ohhhhhh nooooooo!";
  }
}

