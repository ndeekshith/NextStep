package Array;

public class MaximumSubarraySumKadaneAlgorithm {
    public static void main(String[] args) {
        
    }
    public static int maxSubArray(int[] a) {
        int maxSum = a[0];
        int currSum = a[0];
        for( int i = 1; i < a.length; i++){
            currSum = Math.max(a[i], currSum + a[i]);
            maxSum = Math.max(currSum, maxSum);
        }
        return maxSum;
    }
}
