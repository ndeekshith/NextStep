package OOPS.Encapsulation;
class Bank {
    private int accno;

    // public Bank(int accno){
    //     this.accno = accno;
    // }
    public void setNumber(int accno){
        this.accno = accno;

    }
    public int getNumber(){
        return accno;
    }
}
public class Main{
    public static void main(String[] args) {
        Bank b = new Bank();
        b.setNumber(222);
        System.out.println(b.getNumber());
       
    }
}


