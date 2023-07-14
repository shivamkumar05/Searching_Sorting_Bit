import java.util.Scanner;
public class PowerOfTwo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a number to check power of two: ");
        int n = scanner.nextInt();

        

        // Check if the number is a power of two
        boolean isPowerOfTwo = checkPowerOfTwo(n);

        // Print the result
        System.out.println(isPowerOfTwo);
    }

    public static boolean checkPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }

        // Keep dividing the number by 2 until it becomes 1
        while (n > 1) {
            if (n % 2 != 0) {
                return false;
            }
            n /= 2;
        }

        return true;
    }
}
