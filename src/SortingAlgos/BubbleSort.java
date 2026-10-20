
package SortingAlgos;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {12, 34, 23, 34, 56, 78};

        Bubblesort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void Bubblesort(int[] arr) {
        for (int turn = 1; turn < arr.length; turn++) {
            for (int i = 0; i < arr.length - turn; i++) {

                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }
}
