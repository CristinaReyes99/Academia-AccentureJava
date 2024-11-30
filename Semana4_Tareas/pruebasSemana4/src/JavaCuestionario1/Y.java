package JavaCuestionario1;

class X1 {
    X1() {}
    protected void one() {} // Cambiado de private a protected
}

public class Y extends X1 {
    Y() {}
    private void two() {
        one(); // Ahora es accesible
    }

    public static void main(String[] args) {
        new Y().two(); // Esto ahora funciona correctamente
    }
}
