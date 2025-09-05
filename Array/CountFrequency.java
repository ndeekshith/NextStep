package Array;

import java.util.HashMap;

public class CountFrequency {
    public static void main(String[] args) {
        int[] a = {1,2,2,3,4,4,5,5,5,5};
        countFreq(a);
        
    }
    public static void countFreq(int[] a){
        HashMap<Integer, Integer> map = new HashMap<>();
        for( int i : a){
            map.put(i, map.getOrDefault(i , 0) + 1);
        }
        System.out.println(map);
    }
}
