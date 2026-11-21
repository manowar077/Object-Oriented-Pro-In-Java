package Array;

public class TappingWater {
    public static int trap(int[] height) {
        int n = height.length;
        int totalWater = 0;
        for (int i = 0; i < n; i++) {
            int leftMax = 0;
            int rightMax = 0;
            for (int j = 0; j <= i; j++) {
                leftMax = Math.max(leftMax, height[j]);
            }
            for (int j = i; j < n; j++) {
                rightMax = Math.max(rightMax, height[j]);
            }
            totalWater += Math.min(leftMax, rightMax) - height[i];
        }
        return totalWater;
    }
}
