package JavaCuestionario2;

interface i1 {
    public void m1();
}

interface i2 extends i1 {
    public void m2();
}

class Animal14 implements i1, i2 {
    @Override
    public void m1() {
        System.out.println("Método m1 implementado en Animal");
    }

    @Override
    public void m2() {
        System.out.println("Método m2 implementado en Animal");
    }
}

public class Main14 {
    public static void main(String[] args) {
        Animal14 animal = new Animal14();
        animal.m1(); // Llama a m1
        animal.m2(); // Llama a m2
    }
}

