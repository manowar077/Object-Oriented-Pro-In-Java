
package Recursion;

public class GCD {

    public static void main(String[] args) {
        int[] nums = {2, 5, 6, 9, 10};

        int min = nums[0];
        int max = nums[0];

        // Find minimum and maximum
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }

            if (nums[i] > max) {
                max = nums[i];
            }
        }

        System.out.println(gcd(min, max));
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }
}
