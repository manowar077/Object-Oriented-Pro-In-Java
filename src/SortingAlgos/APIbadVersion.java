package SortingAlgos;

public class APIbadVersion {
    public static void main(String[] args) {
        int n = 97;
        int result = firstBadVersion(n);
        System.out.println("First bad version: " + result);
    }

    public static int firstBadVersion(int n) {
        int low = 1;
        int high = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isBadVersion(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    // made static so it can be called from the static firstBadVersion method
    private static boolean isBadVersion(int version) {
        // in the actual LeetCode problem, this is a pre-defined API —
        // here it's just a stub for testing
        return version >= 4; // example: versions 4+ are "bad"
    }
}