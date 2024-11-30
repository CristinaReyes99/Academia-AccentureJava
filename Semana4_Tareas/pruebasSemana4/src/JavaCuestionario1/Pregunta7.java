package JavaCuestionario1;

public class Pregunta7 {
}

class Super {
    private int a;
    protected Super(int a) { this.a = a; }
}

class Sub extends Super {
    public Sub(int a) { super(a); }
    public Sub() { super(5); } //PRIMERA OPCION
    //public Sub() { this(5); } //SEGUNDA OPCION
}

