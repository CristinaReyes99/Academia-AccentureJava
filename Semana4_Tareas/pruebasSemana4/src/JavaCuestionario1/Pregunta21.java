package JavaCuestionario1;

public class Pregunta21 {
    public static void main(String[] args) {
        int x = 2, y = 3, z = 4; //Valores correctos
        int j = 0, k = 0;
        for (int i = 0; i < x; i++) {
            do {
                k = 0;
                while (k < z) {
                    k++;
                    System.out.print(k + " ");
                }
                System.out.println("");
                j++;
            } while (j < y);
            System.out.println("---");

        }
    }
}