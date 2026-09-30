package Array;

public class SecondLargest {
    static void main() {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int largest=Integer.MIN_VALUE;
        int secondlargest=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondlargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>secondlargest && arr[i]!=largest){
                secondlargest=arr[i];
            }
        }
        IO.println(largest);
        IO.println(secondlargest);
    }
}
