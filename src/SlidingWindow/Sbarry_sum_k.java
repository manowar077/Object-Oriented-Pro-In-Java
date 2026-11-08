package SlidingWindow;

public class Sbarry_sum_k {
    static void main() {
        int[] nums={1,2,3,4,5,6,7,8};
        int k=3;
        SumSubArray(nums,k);
        IO.println();
    }
    public static int SumSubArray(int[] nums, int k){
        int n=nums.length;
        int[] prefix=new int[nums.length];
        prefix[0]=nums[0];
        int count=0;
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+nums[i];
            if(prefix[i]==k){
                count++;
            }
        }
        return count;

    }
}
