package SlidingWindow;

public class Sum_of_k_SubArray {
    static void main() {
        int[] arr={1,2,3,4,5,6,7,8};
        int k=3;
        SumSubArray(arr,k);
        IO.println();
    }

    public static int SumSubArray(int[] arr, int k){
        int sum=0,ans=0;
        for(int i=k;i<k;i++){
            sum +=arr[i];
        }
        ans=sum;

        for(int i=k;i<arr.length;i++){
            sum+=arr[i];
            sum-=arr[i-k];
            ans=Math.max(sum,ans);

        }
        return ans;
    }
}
