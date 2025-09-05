package Strings;

import java.util.*;

public class DuplicateCharacterCount {public static void main(String[] args) {
        String str = "programming";
        StringBuilder result = new StringBuilder();
        Set<Character> seen = new HashSet<>();

        for (char ch : str.toCharArray()) {
            if (!seen.contains(ch)) {
                result.append(ch);
                seen.add(ch);
            }
        }

        System.out.println("Original: " + str);
        System.out.println("Without duplicates: " + result.toString());
    }
    
}
