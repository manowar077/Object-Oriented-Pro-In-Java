package Recursion;

public class Print_decrese {
    static void main() {
        int n=5;
        pd(n);
    }
    public static void pd(int n){
        if(n==0){
            return ;
        }
        IO.println(n);
        pd(n-1);
    }
}
