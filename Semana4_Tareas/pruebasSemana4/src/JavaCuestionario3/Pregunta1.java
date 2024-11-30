package JavaCuestionario3;

public class Pregunta1 {


    public int divide (int a, int b) {
        int c = -1;
        try {
            c = a / b;
        } catch (Exception e) {
            System.err.print("Exception ");
        } finally {
            System.err.println("Finally ");
        }
        return c;
    }

    public static void main(String[] args) {
        Pregunta1 pregunta1 = new Pregunta1();
        int result = pregunta1.divide(4, 0); // Llama al método divide con 4 y 0
        System.out.println("Result: " + result);
    }
}
