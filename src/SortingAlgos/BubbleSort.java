package SortingAlgos;

public class BubbleSort {
    static void main() {
        int[] arr={12,34,23,34,56,78};
        for(int i=0;i<arr.length;i++){
            IO.println(arr[i]+" ");
        }

    }
    public static void Bubblesort(int[] arr){
        for(int turn=1;turn<arr.length;turn++){
            for(int i=0;i<arr.length;i++){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
    }
}
