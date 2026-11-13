package Stack;

import java.util.Stack;

public class MinAddToMkeParvalid {
    static void main() {
        String s = "())";
        checkvakid(s);
    }
    public static void checkvakid(String s){
        Stack<Character> st =new Stack<>();
        for (char ch : s.toCharArray()){
            //opening brackets
            int openbracket=0;
            int closebracket=0;
            if(ch=='('||ch=='{'||ch=='['){
                st.push(ch);
                openbracket++;
            } else if (ch==')'||ch=='}'||ch==']') {
               st.push(ch);
               closebracket++;
            }

        }
    }
}
