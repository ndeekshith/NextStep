package Basic;
public class swap{
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        
        System.out.println("Before swap: a = " + a + ", b = " + b);
        swap(a, b);
        swap1(a, b);
        
    }
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swap: a = " + a + ", b = " + b);
    }
    public static void swap1(int a, int b){
        a = a +b;
        b= a - b;
        a = a - b;
        System.out.println("After swap using arithmetic: a = " + a + ", b = " + b);
    }
}