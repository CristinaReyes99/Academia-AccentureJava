package JavaCuestionario3;

public class TestFirstApp {
    static void dolt(int x, int y, int m) {
        if (x == 5) {
            m = y;
        } else {
            m = x;
        }
    }

    public static void main(String[] args) {
        int i = 6, j = 4, k = 9; // Valores iniciales
        // Llamada al método
        TestFirstApp.dolt(i, j, k);
        // Imprimir el valor de k
        System.out.println(k); // Salida esperada: 9
    }
}


