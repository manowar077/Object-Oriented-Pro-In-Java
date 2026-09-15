package Recursion;

public class   Firstoccurence {
    static void main() {
        int[] arr={2,13,7,5,4,6,3,9,3};
        IO.println(FindIndex(arr,0,3));
    }
    public static int FindIndex(int[] arr,int i,int item){
        if(arr[i]==item){
            return i;
        }
        return FindIndex(arr,i+1,item);

    }  
}
