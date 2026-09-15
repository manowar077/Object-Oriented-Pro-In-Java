package Recursion;

public class Print_decrese {
    static void main() {
        int n=5;
        pd(n);
    }
    public static void pd(int n){
       //base case
        if(n==0){
            return ;
        }
        //self work
        IO.println(n);

        //recursive call
        pd(n-1);
    }
}
