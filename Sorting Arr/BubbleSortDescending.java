public class BubbleSortDescending {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 6, 0}; 

        // Sort the array in descending order using bubble sort
        bubbleSortDescending(arr);

        // Print the sorted array
        System.out.print("Output Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void bubbleSortDescending(int[] arr) {
        int n = arr.length;
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

            // If no two elements were swapped in the inner loop, the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }
}
