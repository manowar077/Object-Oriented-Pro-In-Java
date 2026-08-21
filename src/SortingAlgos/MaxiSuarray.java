package SortingAlgos;

public class MaxiSuarray {
    static void main() {
        int[] nums={12,23,45,45,56};
        maxSubArray(nums);
    }
    public static int maxSubArray(int[] nums) {
        int sum=0;
        int maxi=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            //step1 sum create karte ha
            sum=sum+nums[i];
            //step2 maxi create karte ha
            maxi=Math.max(maxi,sum);
            //sum check karte ki negative value to nahi ha
            if(sum<0){
                sum=0;
            }
        }
        //return max value
        return maxi;
    }
}
