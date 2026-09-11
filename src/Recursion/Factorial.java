package Recursion;

public class Factorial {
    static void main() {
        int n=5;
        IO.println(factorial(n));
    }
    public static int factorial(int n){

        if(n==0){
            return 1;
        }
        int fn=factorial(n-1);
        return n*fn;
    }
}

