package Stack;

import java.util.ArrayList;
import java.util.Stack;

public class StockSpanproblem {
    public static void main(String[] args) {
        int[] arr = {100, 80, 60, 70, 60, 75, 85};
        int n = arr.length;
        int[] ans= new int[n];

        Stack<Integer> st= new Stack<>();

       for (int i = 0; i < n; i++) {

            // Remove smaller or equal elements
            while (!st.isEmpty() && arr[i] >= arr[st.peek()]) {
                st.pop();
            }

            // No previous greater element
            if (st.isEmpty()) {
                ans[i] = i + 1;
            } 
            else {
                ans[i] = i - st.peek();
            }

            st.push(i);
        }

        // Convert int[] into ArrayList<Integer>
        ArrayList<Integer> result = new ArrayList<>();

        for (int value : ans) {
            result.add(value);
        }

        // Print the stock span result
        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}