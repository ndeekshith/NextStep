package Basic;

public class LeapYear {
    public static void main(String[] args) {
        
    }
    public static boolean isLeapYear(int year) {
        if ( year % 4 == 0 || (year % 100 == 0 && year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}