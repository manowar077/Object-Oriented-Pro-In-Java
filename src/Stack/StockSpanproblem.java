package Stack;

import java.util.Stack;

public class StockSpanproblem {
    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int n = prices.length;
        int[] spans = new int[n];

        Stack<Integer> stack = new Stack<>();
        spans[0] = 1;
        stack.push(0);

        for (int i = 1; i < n; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }

            spans[i] = stack.isEmpty() ? i + 1 : i - stack.peek();
            stack.push(i);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(spans[i] + " ");
        }
    }
}