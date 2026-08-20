package SortingAlgos;

public class BinarySearch {
    static void main() {
        int[] arr={1,3,4,5,6,7};
        int item=11;
        Search(arr, item);
    }

    public static void Search(int[] arr,int item){
        int low=0;
        int high=arr.length-1;

        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==item){
                return mid;
            }
            else if(arr[mid]>=item){
                high=mid-1;
            }
            else{
                low=mid+1;
            }

        }
        return -1;
    }
}
