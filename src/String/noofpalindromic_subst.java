package String;

public class noofpalindromic_subst {
    static void main() {
        String str="abcdcba";
        int i=0;
        int j=str.length()-1;
        boolean flag=true;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                flag=true;
                break;
            }
            i++;
            j--;
        }
        if(flag==true){
            IO.println("palindrome");
        }
        else{
            IO.println("Not palindromic");
        }
    }
}
