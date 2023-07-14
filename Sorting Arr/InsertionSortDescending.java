public class InsertionSortDescending {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 6, 0};

        // Sort the array in decreasing order using insertion sort
        insertionSortDescending(arr);

        // Print the sorted array
        System.out.print("Output Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void insertionSortDescending(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Shift elements greater than the key to the right
            while (j >= 0 && arr[j] < key) { // Compare elements in decreasing order
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }
}
