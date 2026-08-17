package Array;

public class ReverseWiout {
    static void main() {
        int[] arr= {1, 2, 3, 4, 5, 6};
        Reverse(arr);
        for(int i=0;i<arr.length;i++){
              IO.println(arr[i] +" ");
        }
        }
    public static void Reverse(int[] arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
