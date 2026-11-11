
package Stack;

import java.util.Stack;

public class CheckRedudentBra {

    public static void main(String[] args) {

        String str = "((a+b))";

        System.out.println(Redundent(str));
    }

    public static boolean Redundent(String str) {

        Stack<Character> st = new Stack<>();

        for (char ch : str.toCharArray()) {

            // Opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            }

            // Operators
            else if (ch == '+' || ch == '-' ||
                    ch == '*' || ch == '/') {
                st.push(ch);
            }

            // Closing brackets
            else if (ch == ')' || ch == '}' || ch == ']') {

                boolean operatorfound = false;
                boolean openingFound = false;

                while (!st.isEmpty()) {

                    char temp = st.peek();

                    if (temp == '+' || temp == '-' ||
                            temp == '*' || temp == '/') {
                        operatorfound = true;
                    }

                    // Matching opening bracket
                    if ((ch == ')' && temp == '(') ||
                            (ch == '}' && temp == '{') ||
                            (ch == ']' && temp == '[')) {

                        st.pop();
                        openingFound = true;
                        break;
                    }

                    st.pop();
                }

                if (!openingFound || !operatorfound) {
                    return true;
                }
            }
        }

        return false;
    }
}
