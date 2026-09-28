package Recursion;

public class nth_stair {
    static void main() {
        int n=5;
        IO.println(pd(n));
    }
    public static int pd(int n){
        //base case
        if(n==1){
            return 1;
        } else if (n==2) {
            return 2;
        }
        //self work

        //recursive call

        return pd(n-1)+pd(n-2);
    }
}
