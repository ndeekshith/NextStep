package OOPS.Inheritance;

public class Main {
    public static void main(String[] args) {
        Car mycar = new Car();
        Vehicle car = new Car();
        mycar.start();
        mycar.stop();
        mycar.honk();
        Car tcar = new Toyata();
        tcar.break1();
    }
}
