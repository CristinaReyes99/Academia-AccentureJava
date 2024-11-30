package JavaCuestionario3;

public class DoCompare1 {
    public static void main(String[] args) {
        String[] table = {"aa", "bb", "cc"};
        for (String ss : table) {
            int ii = 0;
            while (ii < table.length) {
                System.out.print(ss + ", " + ii);
                ii++; //aa, 0aa, 1aa, 2bb, 0bb, 1bb, 2cc, 0cc, 1cc, 2
            }
        }
    }
}
