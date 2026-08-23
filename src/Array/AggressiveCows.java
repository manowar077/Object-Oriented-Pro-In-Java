package Array;

import java.util.Arrays;
import java.util.Scanner;

public class AggressiveCows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nos = sc.nextInt();     // number of stalls
        int noc = sc.nextInt();     // number of cows
        int[] stall = new int[nos];

        for (int i = 0; i < stall.length; i++) {
            stall[i] = sc.nextInt();
        }

        Arrays.sort(stall);
        System.out.println(Mindistance(stall, noc));
    }

    public static int Mindistance(int[] stall, int noc) {
        int low = stall[0];
        int high = stall[stall.length - 1];
        int ans = 0;   // moved outside the loop so it survives after the loop ends

        while (low <= high) {
            int mid = (low + high) / 2;

            if (isitPossible(stall, noc, mid)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    public static boolean isitPossible(int[] stall, int noc, int mid) {
        int pos = stall[0];
        int cowsCount = 1;

        for (int i = 1; i < stall.length; i++) {
            if (stall[i] - pos >= mid) {
                cowsCount++;
                pos = stall[i];
            }
            if (cowsCount == noc) {
                return true;
            }
        }
        return false;
    }
}