public class SelectionSortIterations {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 6, 0}; 

        // Find the number of iterations required to sort the array in descending order using selection sort
        int iterations = selectionSortDescendingIterations(arr);

        // Print the number of iterations
        System.out.println("Number of iterations: " + iterations);
    }

    public static int selectionSortDescendingIterations(int[] arr) {
        int n = arr.length;
        int iterations = 0;

        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;

            // Find the index of the maximum element in the unsorted portion of the array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) { // Compare elements in descending order
                    maxIndex = j;
                }
                iterations++;
            }

            // Swap the maximum element with the first element of the unsorted portion
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;
        }

        return iterations;
    }
}
