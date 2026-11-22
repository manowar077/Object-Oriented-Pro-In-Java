package Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class AstriodCollision {

    public static void main(String[] args) {

        int[] asteroids = {5, 10, -5};

        int[] ans = asteroidCollision(asteroids);

        for (int asteroid : ans) {
            System.out.println(asteroid);
        }
    }

    public static int[] asteroidCollision(int[] asteroids) {

        // Create stack using ArrayDeque
        Deque<Integer> st = new ArrayDeque<>();

        // Traverse all asteroids
        for (int ast : asteroids) {

            // Assume current asteroid is alive
            boolean alive = true;

            // Collision condition:
            // Current asteroid moves left
            // Stack top moves right
            while (alive && ast < 0 &&
                   !st.isEmpty() && st.peek() > 0) {

                // Stack top is smaller, so destroy it
                if (st.peek() < -ast) {
                    st.pop();
                }

                // Both have equal size, destroy both
                else if (st.peek() == -ast) {
                    st.pop();
                    alive = false;
                }

                // Stack top is bigger, destroy current asteroid
                else {
                    alive = false;
                }
            }

            // Push current asteroid if it survives
            if (alive && (ast > 0 || st.isEmpty() || st.peek() < 0)) {
                st.push(ast);
            }
        }

        // Convert stack into an answer array
        int[] ans = new int[st.size()];

        for (int i = ans.length - 1; i >= 0; i--) {
            ans[i] = st.pop();
        }

        return ans;
    }
}
