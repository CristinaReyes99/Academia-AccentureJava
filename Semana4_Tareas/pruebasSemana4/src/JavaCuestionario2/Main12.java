package JavaCuestionario2;
public class Main12 {
    public static void main(String[] args) {
        SoundAnimal uno = new SoundAnimal();
        SoundAnimal dos = new SoundDog();

        uno.makeSound();
        dos.makeSound();

        SoundAnimal tres = (SoundDog) new SoundAnimal();
        tres.makeSound();
    }
}

class SoundAnimal {
    void makeSound() {
        System.out.println("Animal sound");
    }
}

class SoundDog extends SoundAnimal {
    void makeSound() {
        System.out.println("Wau Wau");
    }
}

