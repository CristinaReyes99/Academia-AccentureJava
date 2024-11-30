package JavaCuestionario1;

public class SuperTest {
    public void main(String[] args) {
        Square square = new Square ();
        square.foo ();
        square.foo();
    }

    class Shape {
        public Shape() {
            System.out.println("Shape: constructor");
        }
        public void foo() {
            System.out.println("Shape: foo");
        }
    }

    class Square extends Shape {
        public Square() {
            super();
        }
        public void foo() {
            System.out.println("Square: foo");
        }
    }

    public void test() {
        Shape s = new Square();
        s.foo();
    }
}

