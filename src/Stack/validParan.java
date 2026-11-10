
package Stack;

import java.util.Stack;

public class validParan {

    public static void main(String[] args) {

        String value = "({})[]";

        System.out.println(isValid(value));
    }

    public static boolean isValid(String value) {

        Stack<String> st = new Stack<>();

        for (char ch : value.toCharArray()) {

            // Opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {

                st.push(String.valueOf(ch));
            }

            // Closing brackets
            else {

                if (st.empty()) {
                    return false;
                }

                if (ch == ')' && st.peek().equals("(") ||
                        ch == '}' && st.peek().equals("{") ||
                        ch == ']' && st.peek().equals("[")) {

                    st.pop();

                } else {
                    return false;
                }
            }
        }

        return st.isEmpty();
    }
}
