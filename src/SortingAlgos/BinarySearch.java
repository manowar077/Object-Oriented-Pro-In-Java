package SortingAlgos;
public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6, 7};
        int item = 7;

        int result = Search(arr, item);

        if (result == -1) {
            System.out.println("Item not found");
        } else {
            System.out.println("Item found at index: " + result);
        }
    }

    public static int Search(int[] arr, int item) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == item) {
                return mid;
            } else if (arr[mid] > item) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }
}
