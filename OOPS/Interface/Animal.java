package OOPS.Interface;

 interface Animal {
     
    void walk();
    
    
}   
 interface Animal2 {
    abstract void sound();
    void sleep();
 }
 class Lion implements Animal, Animal2{
public void walk(){
    System.out.println("Walking...");
    }
   public void sleep(){
    System.out.println("Sleeping");
   }
  public void sound(){
    System.out.println("roaring");
   }
    }
 