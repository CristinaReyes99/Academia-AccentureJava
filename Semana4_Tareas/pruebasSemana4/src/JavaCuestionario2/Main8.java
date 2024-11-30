package JavaCuestionario2;

import java.io.*;

class Base {
    void show() throws IOException {
        System.out.println("Base show");
    }
}

class Derived extends Base {
    void show() throws FileNotFoundException {
        System.out.println("Derived show");
    }
}

public class Main8 {
    public static void main(String[] args) {
        Base obj = new Derived();
        try {
            obj.show(); // Llama al método en Derived
        } catch (IOException e) {
            System.out.println("Exception caught");
        }
    }
}

