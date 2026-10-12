package Recursion;

public class tower_of_hanoi {
    static void main() {
     int n=3;
     toh(n,"A","B","C");
    }
    public static void toh(int n, String src, String hel, String des){
        if(n==0){
            return;
        }
        toh(n-1,src,des,hel);
        IO.println("Move"+n+"nth from"+src+"to"+des);
        toh(n-1,hel,src,des);

    }
}
