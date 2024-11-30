package JavaCuestionario1;

public class SampleClass {
    public static void main(String[] args) {
        AnotherSampleClass asc = new AnotherSampleClass();
        SampleClass sc = new SampleClass();
        sc = asc;
    }
}

class AnotherSampleClass extends SampleClass { }

