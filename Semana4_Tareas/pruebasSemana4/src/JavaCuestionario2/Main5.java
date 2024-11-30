package JavaCuestionario2;

class Parent {
    void display(int num) { //Overload
        System.out.println("Parent: " + num);
    }
    void display(String msg) { //Overload
        System.out.println("Parent: " + msg);
    }
}
class Child extends Parent {

    @Override
    void display(int num) {
        System.out.println("Child: " + num);
    }
}
public class Main5 {
    public static void main(String[] args) {
        Parent obj = new Child(); // obj es del tipo Parent, pero apunta a un objeto Child
        obj.display(5);// Llama a display(int)
        obj.display("Hello"); // Llama a display(String)
    }
}

