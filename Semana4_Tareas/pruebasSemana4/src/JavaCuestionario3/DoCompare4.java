package JavaCuestionario3;

public class DoCompare4 {
    public static void main(String[] args) {
        String[] table = {"aa", "bb", "cc"};
        int ii = 0;
        do {

            while (ii < table.length) {
                System.out.println(ii++); // 0 1 2
            }
        }while (ii < table.length) ;
    }
}

