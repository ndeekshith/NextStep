package OOPS.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound("ass");
        Dog d = new Dog();
        d.sound("Dog");
        Animal e = new Dog();
        e.sound("Lion");
        e.sound();
    }
}
