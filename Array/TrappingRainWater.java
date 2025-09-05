package Array;

public class TrappingRainWater {
    public static void main(String[] args) {
        
    }
    public static int trap(int[] height) {
        if( height.length == 0){
            return 0;
        }
        int n = height.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        leftMax[0] = height[0];
        for( int i = 1; i < n; i++){
            leftMax[i] = Math.max(leftMax[i -1], height[i]);
        }

        rightMax[n - 1] = height[ n - 1];
        for( int i = n - 2; i >= 0; i--){
            rightMax[i] = Math.max(rightMax[ i + 1], height[i]);
        }
        int trap = 0;
        for( int i = 0; i < n; i++){
            int waterlevel = Math.min(leftMax[i], rightMax[i]);
            trap += waterlevel - height[i];
        }
        return trap;
    }
    
}
