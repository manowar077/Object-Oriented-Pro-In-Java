package String;
import java.util.*;

public class PrintAlllSubstring {
    static void main() {
        String str="abcd";
        for(int i=0;i<=3;i++){
            for(int j=i+1;j<=4;j++){
                IO.println(str.substring(i,j)+" ");
            }
        }

    }
}
