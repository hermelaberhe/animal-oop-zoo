// Demonstrates inheritance and polymorphism with animals and pets.

class Animal {
    String noise;

    Animal(String noise) {
        this.noise = noise;
    }

    void speak() {
        System.out.println(this.noise);
    }
}

class Pet extends Animal {
    String name;

    Pet(String name, String noise) {
        super(noise); // Calls Animal constructor
        this.name = name;
    }

    @Override
    void speak() {
        System.out.printf("Hi, my name is '%s'. I go '%s'!!!\n", this.name, this.noise);
    }
}

class Dog extends Pet {
    Dog(String name) {
        super(name, "Woof");
    }
}

class Cat extends Pet {
    Cat(String name) {
        super(name, "Meow");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal("squeak");
        Pet p = new Pet("Rocky the Pet Rock", "...");
        Dog d = new Dog("Dandy");
        Cat c = new Cat("Bianca");

        Animal[] zoo = { a, d, c, p };

        for (Animal animal : zoo) {
            animal.speak(); // Demonstrates polymorphism
        }
    }
}
