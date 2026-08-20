package SortingAlgos;

public class Kthroot {
    static void main() {
        int n=87;
        int k=3;
    }
    public static void kthroot(int n,int k){
        int low=0;
        int high=n;
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(Math.pow(mid,k)<=n){
                ans=mid;
                low=mid+1;
            }
        }
    }
}
