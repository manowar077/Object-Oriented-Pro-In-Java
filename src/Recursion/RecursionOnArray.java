package Recursion;

public class RecursionOnArray {
    static void main() {
        int[] arr={5,3,7,12,76,9,34,5};
        recurprint(arr,0);
    }
    public static void recurprint(int[] arr,int idx){
        if(idx==arr.length) return;
        IO.println(arr[idx]);
        recurprint(arr,idx+1);
    }
}
