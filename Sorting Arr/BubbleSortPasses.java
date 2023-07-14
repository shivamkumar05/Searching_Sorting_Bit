public class BubbleSortPasses {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 6, 0}; 

        // Find the number of passes required to sort the array in descending order using bubble sort
        int passes = bubbleSortDescendingPasses(arr);

        // Print the number of passes
        System.out.println("Number of passes: " + (passes - 1));
    }

    public static int bubbleSortDescendingPasses(int[] arr) {
        int n = arr.length;
        int passes = 0;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) { // Compare adjacent elements in descending order
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            passes++;


            // If no two elements were swapped in the inner loop, the array is already sorted
            if (!swapped) {
                break;
            }
        }

        return passes;
    }
}
