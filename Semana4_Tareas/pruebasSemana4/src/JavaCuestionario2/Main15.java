package JavaCuestionario2;

class Animal15 {
    void makeSound() throws Exception {
        System.out.println("Animal makes a sound");
    }
}

class Dog15 extends Animal15 {
    void makeSound() throws RuntimeException {
        System.out.println("Dog barks");
    }
}

public class Main15 {
    public static void main(String[] args) {
        Animal15 myDog = new Dog15();
        try {
            myDog.makeSound();
        } catch (Exception e) {
            System.out.println("Exception caught");
        }
    }
}

