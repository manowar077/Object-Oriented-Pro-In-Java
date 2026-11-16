package Stack;

import java.util.Arrays;
import java.util.Stack;

public class DailyTempMonotonic {
    public static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                int previousIndex = stack.pop();
                result[previousIndex] = i - previousIndex;
            }
            stack.push(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] temp = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] ans = dailyTemperatures(temp);
        System.out.println(Arrays.toString(ans));
    }
}
