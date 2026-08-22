package SortingAlgos;

public class APIbadVersion {
    static void main() {
      int n=97;
      firstBadVersion(n);
    }
        public static int firstBadVersion(int n) {
            int low = 1;
            int high = n;

            while (low <= high) {
                int mid = low + (high - low) / 2;

                if (DisBadVersion(     mid)) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            return low;
        }


    private boolean isBadVersion(int mid) {
        return false;
    }
}
