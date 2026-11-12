
package String;

import java.util.Stack;

public class DetermineIfaStringIsVAlid {

    public static void main(String[] args) {
        String str = "abcabb";

        System.out.println(checkvalid(str));
    }

    public static boolean checkvalid(String str) {

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'b') {
                st.push(ch);
            }

            else if (ch == 'c') {

                if (st.size() < 2) {
                    return false;
                }

                if (st.peek() == 'b'||st.peek()=='a') {
                    st.pop();
                } else {
                    return false;
                }
            }
        }

        return st.isEmpty();
    }
}
