package String;

import java.util.HashSet;
import java.util.Scanner;

public class longest_substrind_window {
    static void main() {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();

        HashSet<Character> set =new HashSet<>();

        int left=0;
        int maxlength=0;

        for(int right=0;right<s.length();right++){

            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(right));
                left++;
            }

            set.add(s.charAt(right));
            maxlength=Math.max(maxlength,right-left+1);
        }
        IO.println(maxlength);
    }
}
