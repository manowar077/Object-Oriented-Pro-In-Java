
package Stack;

import java.util.Arrays;
import java.util.Stack;

public class NextSmallerEle {

    public static void main(String[] args) {

        int[] arr = {4, 8, 5, 2, 25};

        int n = arr.length;
        int[] result = new int[n];

        Stack<Integer> st = new Stack<>();

        // Traverse from right to left
        for (int i = n - 1; i >= 0; i--) {

            // Remove all greater or equal elements
            while (!st.isEmpty() && st.peek() >= arr[i]) {
                st.pop();
            }

            // Check whether smaller element exists
            if (st.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = st.peek();
            }

            // Push current element
            st.push(arr[i]);
        }

        System.out.println(Arrays.toString(result));
    }
}
