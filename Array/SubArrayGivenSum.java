package Array;

import java.util.HashMap;

public class SubArrayGivenSum {
    public static void main(String[] args) {
        
    }
    public static int[] findSubArray(int[] a, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        int currsum = 0;
        for(int i = 0; i < a.length; i++){
            currsum += a[i];
            if(currsum == target) return new int[]{0, i};
            if(map.containsKey(currsum - target))
                return new int[]{map.get(currsum - target) + 1, i};
                map.put(currsum, i);
        }
        return new int[]{-1, -1};
    }
}
