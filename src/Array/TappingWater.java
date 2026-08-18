package Array;

public class TappingWater {
    static void main() {
        class Solution {
            public int trap(int[] height) {
                int n = height.length;
                int totalwater = 0;

                for (int i = 0; i < n; i++) {
                    int leftMax = 0;
                    int rightMax = 0;

                    // find left max — only up to and including i
                    for (int j = 0; j <= i; j++) {          // ✅ fixed: j<=i
                        leftMax = Math.max(leftMax, height[j]);
                    }

                    // find right max — from i to end
                    for (int j = i; j < n; j++) {
                        rightMax = Math.max(rightMax, height[j]);
                    }

                    totalwater += Math.min(leftMax, rightMax) - height[i];
                }
                return totalwater;
            }
        }
    }
}
