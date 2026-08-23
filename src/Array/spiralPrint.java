package Array;

public class spiralPrint {
    static void main() {
        int[][] arr={{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        spiralPrint(arr);
    }
    public static void spiralPrint(int[][] arr){
        int minr=0;
        int maxr=arr.length-1;
        int minc=0;
        int maxc=arr[0].length-1;
        int count=0;
        int totalelement=arr.length*arr[0].length;
        while(count<totalelement)
        for(int i=minc;i<=maxc && count<totalelement;i++){
            IO.println(arr[minr][i]);
            count++;
        }
        minr++;
        for(int i=minr;i<=maxr && count<totalelement;i++){
            IO.println(arr[i][maxc]);
            count++;
        }
        maxc--;
        for(int i=maxc;i>=minc && count<totalelement;i--){
            IO.println(arr[maxr][i]);
            count++;
        }
        maxr--;
        for(int i=maxr;i>=minr && count<totalelement;i--){
            IO.println(arr[i][minc]);
            count++;
        }
        minc++;
    }
}
