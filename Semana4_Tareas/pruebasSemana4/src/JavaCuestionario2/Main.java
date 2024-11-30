package JavaCuestionario2;

class Animal {
    void makeSound() throws Exception {
        System.out.println("Animal makes a sound");
    }
}
class Perro extends Animal {
    void makeSound() throws RuntimeException {
        System.out.println("Dog barks");
    }
}
public class Main {
    public static void main(String[] args) {
        Animal myDog = new Perro();
        try {
            myDog.makeSound();
        } catch (Exception e) {
            System.out.println("Exception caught");
        }
    }
}

