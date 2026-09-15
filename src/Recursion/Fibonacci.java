package Recursion;

public class Fibonacci {
    static void main() {
        int n=5;
        fibo(n);
    }
    public static int fibo(int n){

        if(n==1 || n==0){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
