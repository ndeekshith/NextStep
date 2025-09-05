package OOPS.Polymorphism;

public class Animal { 
    // Overloading compile time
    void sound(){
        System.out.println("Animal makes a sound");
    }

    void sound(String type){
        System.out.println("Animal sound "+type);
    }
}

class Dog extends Animal{
    // overriding
void sound(String type){
    System.out.println("Dog is barking"+type);
}
}
