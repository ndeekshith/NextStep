package Array;

public class FirstLastOccurance {
    public static void main(String[] args) {
        
    }
    public static int[] find(int[] a, int target){
        int first = -1, last = -1;
        for(int i = 0; i< a.length; i++){
            if (a[i] == target){
                if (first == -1){
                    first = i;
                }
                last = i;
            }
        }
        return new int[]{first, last};
    }
    
}
