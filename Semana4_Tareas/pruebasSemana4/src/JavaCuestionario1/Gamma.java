package JavaCuestionario1;

class Alpha {
    String getType() {
        return "alpha";
    }
}
class Beta extends Alpha {
    String getType() {
        return "beta";
    }
}
public class Gamma extends Beta {
    String getType() {
        return "gamma";
    }

    public static void main(String[] args) {
       // Gamma g1 = new Alpha(); //Error
       // Gamma g2 = new Beta();  //Error
       // System.out.println(g1.getType() + " " + g2.getType());
        Gamma g3 = new Gamma();
        Alpha g4 = new Gamma();
        Beta g5 = new Gamma();
        Alpha g6 = new Beta();
        System.out.println(STR."g3:\{g3.getType()} g4:\{g4.getType()} g5:\{g5.getType()} g6:\{g6.getType()} ");
    }
}

