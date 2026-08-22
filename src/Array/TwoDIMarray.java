package Array;

import java.util.Scanner;

public class TwoDIMarray {
    static void main() {
        Scanner sc =new Scanner(System.in);
        int r= sc.nextInt();
        int c= sc.nextInt();
        int[][] arr=new int[r][c];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        Display(arr);
    }
    public static void Display(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                IO.println(arr[i][j]+" ");
            }
            IO.println();
        }
    }
}
