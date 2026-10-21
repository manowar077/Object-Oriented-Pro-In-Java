package String;
import java.util.*;

public class Toggle {
    static void main() {
        Scanner sc=new Scanner(System.in);
        StringBuilder str=new StringBuilder(sc.next());

        //toggle case
        //PhYSics->pHysICS

        for(int i=0;i<str.length();i++){
            //diff betweem assci value of A and a=32
            //check aplhabet
            boolean flag=true;
            char ch=str.charAt(i);
            int asci=(int)ch;

            if(asci>=90){
                flag=true;
            }
            if(flag==true){
                asci+=32;
                char dh=(char)asci;
                str.setCharAt(i,dh);
            }
            else{
                asci-=32;
                char dh=(char)asci;
                str.setCharAt(i,dh);
            }
        }
        IO.println(str);
    }
}
