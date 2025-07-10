public class main {
  public static void main(String[] args) {
    Herbivore gaz = new Gazelle();
    Animal bigFluff = new Tiger();
    System.out.println(gaz.makeSound());
    bigFluff.printAnimal();
    bigFluff.drinkWater();
    gaz.drinkWater();
    gaz.runFromPredator();
  }
}
