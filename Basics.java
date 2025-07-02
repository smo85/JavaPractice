public class Basics {
    public static void main(String[] args) {
        Cat miso = new Cat("Miso", "tabby", 3);

        miso.printTheCat();
        miso.increaseAge();
        miso.printTheCat();
        System.out.println(miso.eat());
        System.out.println(miso.sound());
    }
}

class Cat extends Animal implements Actions {  // concrete class, we can create an instance of it
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

    public String sound() {
        return "meow";
    }
}

abstract class Animal {
    public abstract String sound();

    public String eat() {
        return "munch munch";
    }
}

interface Actions {
    String sound();
    String eat();
}

