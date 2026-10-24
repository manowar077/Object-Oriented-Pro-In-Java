package String;

public class noofpalindromic_subst {
    static void main() {
        String str="abcdcba";
        StringBuilder gtr=new StringBuilder(str);
        gtr.reverse();
        if(str.equals(gtr)){
            IO.println("Palindrome");
        }
        else{
            IO.println("not palindrome");
        }
    }
}
