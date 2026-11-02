package DP;

public class SieveofEro {
    static void main() {
     PrintPrime(100);
    }
    public static boolean PrintPrime(int n){
        boolean [] prime= new boolean[n+1];
        //ith index pe true ha iska matlab i prime nahi hai
        for(int i=2;i<prime.length;i++){
            prime[i]=true;
        }

        for(int i=2;i*i<prime.length;i++){
            if(prime[i]==true){
                for(int j=2;j*i<prime.length;j++){
                    prime[i*j]=false;
                }

            }
        }
        for(int i=2;i<prime.length;i++){
            if(prime[i]==true){
                IO.println(i+" ");
            }
        }
        return false;
    }
}
