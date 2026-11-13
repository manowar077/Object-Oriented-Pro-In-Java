
package Stack;

import java.util.Stack;

public class MinAddToMkeParvalid {

    public static void main(String[] args) {
        String s = "())))";
        System.out.println(checkvakid(s));
        minAddToMakeValid(s);
    }

    public static int checkvakid(String s) {
        Stack<Character> st = new Stack<>();
        int closebracket = 0;

        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                st.push(ch);
            }
            else if (ch == ')') {

                if (!st.isEmpty()) {
                    st.pop();
                }
                else {
                    closebracket++;
                }
            }
        }

        return closebracket + st.size();
    }
    public static int minAddToMakeValid(String s) {

        int openbracket = 0;
        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                st.push(ch);
            }
            else if (ch == ')') {

                if (!st.isEmpty()) {
                    st.pop();
                }
                else {
                    openbracket++;
                }
            }
        }

        return openbracket + st.size();
    }

}
