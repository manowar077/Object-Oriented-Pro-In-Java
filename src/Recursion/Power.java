package Recursion;

import static java.lang.Math.pow;
import static java.lang.Math.unsignedPowExact;

public class Power {
    static void main() {
        int x=4;
        int n=5;
        IO.println(pow(x,n));

    }
    public static int pow(int x,int n){
        if(n==0){
            return 1;
        }
        int ans=unsignedPowExact(x,n-1);
        return ans*x;
    }
}
