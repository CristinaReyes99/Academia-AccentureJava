package JavaCuestionario3;

public class SampleClass {
    public static void main(String[] args) {
        SampleClass sc, sca, scb;
        sc = new SampleClass();
        sca = new SampleClassA();
        scb = new SampleClassB();
        System.out.println("Hash is: " + sc.getHash() + ", "
                + sca.getHash() + ", " + scb.getHash()); //Hash is: 111111, 44444444, 999999999
    }

    public int getHash() {
        return 111111;
    }
}

class SampleClassA extends SampleClass {
    public int getHash() {
        return 44444444;
    }
}

class SampleClassB extends SampleClass {
    public int getHash() {
        return 999999999;
    }
}
