package Array;

public class TransposeSquare {
    static void main() {
           int[][] arr={{1,2,3,4},
                        {5,6,7,8,},
                        {9,10,11,12},
                        {13,14,15,16}};

           TransposeSquare(arr);
           for(int i=0;i<arr.length;i++){
               for(int j=0;j<arr[0].length;j++){
                   IO.println(arr[i][j]+ " ");
               }
               IO.println();
           }
    }
    public static void TransposeSquare(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr[0].length;j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
}
