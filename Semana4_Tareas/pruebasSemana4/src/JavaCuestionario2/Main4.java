package JavaCuestionario2;

interface Movable {
    void move();
}
abstract class Vehicle {
    abstract void fuel();
}
class Car extends Vehicle implements Movable {
    void fuel() {
        System.out.println("Car is refueled");
    }
    public void move() {
        System.out.println("Car is moving");
    }
}
public class Main4 {
    public static void main(String[] args) {
        Vehicle myCar = new Car(); // myCar es de tipo Vehicle pero apunta a un Car
        myCar.fuel(); // Llama al método fuel de la clase Car
        ((Movable) myCar).move(); // Realiza un cast para llamar al método move
    }
}


