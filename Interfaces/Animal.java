package Interfaces;

public interface Animal {
  String ANIMAL = "ANIMAL";

  String makeSound();
  String eat();

  static boolean isAnimal(String speciesType) {
    if(speciesType.equals(ANIMAL)) {
      return true;
    }
    return false;
  }

  default void printAnimal() {
    System.out.println("I am an animal");
  }

  default void drinkWater() {
    System.out.println("Thirsty yum yum!");
  }
}
