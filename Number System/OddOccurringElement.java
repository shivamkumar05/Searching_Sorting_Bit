public class OddOccurringElement {
    public static void main(String[] args) {
        int[] arr = {4, 3, 6, 2, 6, 4, 2, 3, 4, 3, 3};

        // Find the odd occurring element
        int oddElement = findOddOccurringElement(arr);

        // Print the result
        System.out.println("The odd occurring element is: " + oddElement);
    }

    public static int findOddOccurringElement(int[] arr) {
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            result ^= arr[i];
        }

        return result;
    }
}
