import Inheritance.Dinosaur;
import Inheritance.Ecosystem;
import Inheritance.Trex;
import Interfaces.Animal;
import Interfaces.Gazelle;
import Interfaces.Herbivore;
import Interfaces.Tiger;

public class main {
  public static void main(String[] args) {
    Ecosystem myForest = new Ecosystem("forest", new Trex());
    Dinosaur forestRex = myForest.getDinosaur();
    System.out.println(forestRex.attack());

    // figure out how to get this to work
  }
}
