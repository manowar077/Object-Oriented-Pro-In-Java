package Array;

public class Book_Allocation {
    public static void main(String[] args) {
        int[] page = {10, 20, 30, 40};
        int nos = 2; // no. of students
        System.out.println(Mainpage(page, nos));
    }

    public static int Mainpage(int[] page, int nos) {
        int low = 0;
        int high = 0;

        for (int i = 0; i < page.length; i++) {
            low = Math.max(low, page[i]);  // low = largest single page count
            high += page[i];                // high = sum of all pages
        }

        int ans = 0;

        while (low <= high) {
            int mid = (high + low) / 2;

            if (itisposible(page, nos, mid)) {
                ans = mid;
                high = mid - 1;   // try to minimize further
            } else {
                low = mid + 1;    // mid too small, need more pages allowed
            }
        }

        return ans;
    }

    private static boolean itisposible(int[] page, int nos, int mid) {
        int student = 1;
        int readpage = 0;

        for (int i = 0; i < page.length; i++) {
            if (readpage + page[i] <= mid) {
                readpage += page[i];
            } else {
                student++;
                readpage = page[i];
            }

            if (student > nos) {
                return false;
            }
        }

        return true;   // ✅ fixed: reaching here means allocation succeeded within `nos` students
    }
} 
