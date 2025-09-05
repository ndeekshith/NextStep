package Strings;
class CleanString {
    public static void main(String[] args) {
        String s = "He@ll o# Wo!rld";
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(s);
    }
}
