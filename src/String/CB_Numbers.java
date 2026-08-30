package String;

public class CB_Numbers {
    static void main() {
        String s="81737";
    }
    public static int PrintSubstring(String s){
        int count=0;
        for(int len=1;len<=s.length();len++){
            for(int j=len;j<=s.length();j++){
                int i=j-len;
                String s1=s.substring(i,j);
                if(IsCBnumber(Long.parseLong(s))==true){
                    count++;
                }
            }
        }
        return count;
    }
    public static boolean IsCBnumber(long num){
        if(num==0 || num==1){
            return false;
        }
        int[] arr={2,3,4,5,7,11,13,17,19,2};
        for(int i=0;i<arr.length;i++){
            if(num==arr[i]){
                return true;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(num%arr[i]==0){
                return false;
            }
        }
        return true;
    }
}
