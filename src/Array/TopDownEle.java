package Array;

public class TopDownEle {
    static void main() {
        int[][] arr ={{12,23,12,23,23},{23,33,23,13,56},{12,34,56,78,34},{34,32,34,67,56}};
        for(int col=0;col<arr[0].length;col++){
            if(col%2==0){
                for(int row=0;row<arr.length;row++) {
                    IO.println(arr[row][col]);
                }

            }
            else{
                for(int row=arr.length-1;row>=0;row--){
                    IO.println(arr[row][col]);
                }
            }
        }

    }
}
