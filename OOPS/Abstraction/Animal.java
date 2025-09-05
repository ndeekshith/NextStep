package OOPS.Abstraction;

abstract class Animal {
    abstract void sound();
    void breathe(){
        System.out.println("Animal is breathing");
    }
    
}
class Dog extends Animal{
void sound(){
    System.out.println("Barking...");
}
}