package Array;

public class RotateArray {
    static void main() {
        int[] arr={1,2,3,4,5,6};
        int k=3;
        rotate(arr,k);
        for(int i=0;i<arr.length;i++){
            IO.println(arr[i]+" ");
        }
    }

    public static void rotate(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        int last_ele=arr[n-1];
        for(int i=n-2;i>=0;i--){
            arr[i+1]=arr[i];
        }
        arr[0]=last_ele;

    }
}
