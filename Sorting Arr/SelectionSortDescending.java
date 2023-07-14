public class SelectionSortDescending {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 6, 0};

        // Sort the array in descending order using selection sort
        selectionSortDescending(arr);

        // Print the sorted array
        System.out.print("Output Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void selectionSortDescending(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;

            // Find the index of the maximum element in the unsorted portion of the array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) { // Compare elements in descending order
                    maxIndex = j;
                }
            }

            // Swap the maximum element with the first element of the unsorted portion
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
