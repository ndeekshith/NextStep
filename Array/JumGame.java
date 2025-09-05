package Array;

public class JumGame {
    public static void main(String[] args) {
        
    }
    public static boolean canJump(int[] nums) {
        if(nums == null || nums.length == 0){
            return false;
        }
        int maxReach = 0;
        for (int i = 0; i < nums.length; i++){
            if(i > maxReach){
                return false;
            }
            maxReach = Math.max(maxReach, i + nums[i]);
        }
        return true;
    }
}
