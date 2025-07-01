import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Basics {
    public static void main(String[] args) {
        Cat miso = new Cat("Miso", "tabby", 3);

        miso.printTheCat();
        miso.increaseAge();
        miso.printTheCat();
    }
}

class Cat {
    private String name;
    private String breed;
    private Integer age;

    public Cat(String name, String breed, Integer age) {  // constructor to create new objects
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public void increaseAge() {
        this.age++;
    }

    public void printTheCat() {
        System.out.println(this.name + " is " + this.age);
    }
}

