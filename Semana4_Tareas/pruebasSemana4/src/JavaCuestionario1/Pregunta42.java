package JavaCuestionario1;

public class Pregunta42 {
}

class X{
    String str = "default";
    X(String s) {str = s;}
    void print() {
        System.out.println(str);
    }

    public static void main(String[] args) {
        new X("hello").print();
    }
}