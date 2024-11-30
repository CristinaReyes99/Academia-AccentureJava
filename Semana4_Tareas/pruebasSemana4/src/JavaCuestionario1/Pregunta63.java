package JavaCuestionario1;

public class Pregunta63 {

}
    class Foo {
        public void addFive() {
          //  a = a + 5;
            System.out.println("f");
        }
    }

    class Bar extends Foo {
        public int a = 0;

        public void addFive() {
            this.a += 5;
            System.out.println("b");
        }
    }

