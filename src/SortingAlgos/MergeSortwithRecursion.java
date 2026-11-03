
package SortingAlgos;

import java.util.Arrays;

public class MergeSortwithRecursion {

    public static void main(String[] args) {

        int[] arr = {5, 1, 3, 4, 2};

        int[] ans = Sort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(ans));
    }

    public static int[] Sort(int[] arr, int si, int ei) {

        // Base condition
        if (si == ei) {
            return new int[]{arr[si]};
        }

        int mid = si + (ei - si) / 2;

        // Divide into two parts
        int[] fs = Sort(arr, si, mid);
        int[] ss = Sort(arr, mid + 1, ei);

        // Merge both sorted arrays
        return merge(fs, ss);
    }

    public static int[] merge(int[] arr1, int[] arr2) {

        int n = arr1.length;
        int m = arr2.length;

        int[] result = new int[n + m];

        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {

            if (arr1[i] <= arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }

        while (i < n) {
            result[k++] = arr1[i++];
        }

        while (j < m) {
            result[k++] = arr2[j++];
        }

        return result;
    }
}
