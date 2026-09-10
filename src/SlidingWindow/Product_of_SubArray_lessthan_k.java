package SlidingWindow;

public class Product_of_SubArray_lessthan_k {
    static void main() {
        int[] arr={10,5,2,6};
        int k=100;
        IO.println(countOfsuarray(arr,k));
    }
    public static int countOfsuarray(int[] arr,int k){
        int i=0,j=0;
        int si=0;
        int ei=0;
        int pro=1;
        int ans=0;
        //if less than 1

        while(ei<arr.length){
            //growing
            pro*=arr[i];

            //shrinking
            while(pro>=k && ei<si){
                pro/=arr[si];
                si++;
            }

            //updating or ans calculation
            ans+=(ei-si+1);
            ei++;
        }
        return ans;

    }
}
