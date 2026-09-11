package Recursion;

public class Factorial {
    static void main() {
        int n=5;
        IO.println(factorial(n));
    }
    public static int factorial(int n){
        int fn=factorial(n-1);
        return n*fn;
    }
}

