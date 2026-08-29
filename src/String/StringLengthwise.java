package String;

public class StringLengthwise {
    static void main() {
        String str="84513";
        PrintSubString(str);

    }
    public static void PrintSubString(String s){
        for(int len=1;len<=s.length();len++){
            for(int j=len;j<=s.length();j++){
                int i=j-len;
                IO.println(s.substring(i,j)+" ");
            }
            IO.println();
        }
    }
}
