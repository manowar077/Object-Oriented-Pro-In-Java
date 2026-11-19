
package Stack;

import java.util.Deque;
import java.util.ArrayDeque;

public class RemoveKDigits {

    public static void main(String[] args) {

        String num = "1432219";
        int k = 3;

        System.out.println(remove(num, k));
    }

    static String remove(String num, int k) {

        Deque<Character> st = new ArrayDeque<>();

        // Step 1: Apply monotonic stack pattern
        for (char ch : num.toCharArray()) {

            while (!st.isEmpty() && k > 0 && st.peek() > ch) {
                st.pop();
                k--;
            }

            st.push(ch);
        }

        // Step 2: Remove remaining digits
        while (k > 0 && !st.isEmpty()) {
            st.pop();
            k--;
        }

        // Step 3: Build answer
        StringBuilder ans = new StringBuilder();

        while (!st.isEmpty()) {
            ans.append(st.pop());
        }

        ans.reverse();

        // Step 4: Remove leading zeros
        int index = 0;

        while (index < ans.length() && ans.charAt(index) == '0') {
            index++;
        }

        String result = ans.substring(index);

        return result.isEmpty() ? "0" : result;
    }
}
