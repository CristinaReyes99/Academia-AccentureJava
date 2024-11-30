package JavaCuestionario2;

import java.util.ArrayList;
import java.util.List;

class Animales {
    void makeSound() {
        System.out.println("Animal sound");
    }
}

class dog extends Animales {
    void makeSound() {
        System.out.println("Bark");
    }
}

class Cat extends Animales {
    void makeSound() {
        System.out.println("Meow");
    }
}

public class Main7 {
    public static void main(String[] args) {
        List<Animales> animals = new ArrayList<>();
        animals.add(new dog());
        animals.add(new Cat());
        animals.add(new Animales());

        for (Animales animal : animals) {
            animal.makeSound();
        }
    }
}

