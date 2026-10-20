
package SortingAlgos;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {12, 23, 34, 34, 56, 78};

        Bubblesort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
         }
    }

    public static void Bubblesort(int[] arr) {
        int n = arr.length;

        for (int turn = 1; turn < n; turn++) {
            boolean swapped = false;

            for (int i = 0; i < n - turn; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }
}
