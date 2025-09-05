package OOPS.Inheritance;

public class Vehicle {
    void start(){
        System.out.println("Vehicle is started");
    }
    void stop(){
        System.out.println("Vehicle is stopped");
    }
}
class Car extends Vehicle{
    void honk(){
        System.out.println("Car is honking");
    }
    void break1(){
        
    }
}
class Toyata extends Car{
    void break1(){
        System.out.println("Break");
    }
}