package Strings;
public class StringRotationCheck {
    public static void main(String[] args) {
        String str1 = "waterbottle";
        String str2 = "erbottlewat";
        boolean result = (str1.length() == str2.length() && (str1 + str1).contains(str2));
        System.out.println(result ? "Yes, it is a rotation." : "No, it is not a rotation.");
    }
}
