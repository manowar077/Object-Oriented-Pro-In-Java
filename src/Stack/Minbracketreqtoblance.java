
package Stack;

import java.util.Stack;

public class Minbracketreqtoblance {

    public static void main(String[] args) {
        String str = "{{{{}}}}";

        System.out.println(minReversals(str));
    }

    public static int minReversals(String str) {

        // Odd length means balancing is impossible
        if (str.length() % 2 != 0) {
            return -1;
        }

        Stack<Character> st = new Stack<>();

        // Remove all valid pairs
        for (char ch : str.toCharArray()) {

            if (ch == '}' && !st.isEmpty() && st.peek() == '{') {
                st.pop();
            } else {
                st.push(ch);
            }
        }

        int open = 0;
        int close = 0;

        // Count unmatched brackets
        while (!st.isEmpty()) {

            if (st.pop() == '{') {
                open++;
            } else {
                close++;
            }
        }

        // Minimum reversals
        return (open + 1) / 2 + (close + 1) / 2;
    }
}
