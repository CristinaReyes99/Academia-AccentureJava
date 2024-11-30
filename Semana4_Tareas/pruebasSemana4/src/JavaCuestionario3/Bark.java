package JavaCuestionario3;

public class Bark {
    // Insert code here - Line 5
    abstract class Dog {
        public abstract void bark();
    }

    // Insert code here - Line 9
    public class Poddle extends Dog {
        public void bark() {
            System.out.println("woof");
        }
    }
}
