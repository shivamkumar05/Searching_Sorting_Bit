import java.util.Scanner;

public class CountSetBits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a number to count set bits: ");
        int number = scanner.nextInt();
        // Count the number of set bits
        int count = countSetBits(number);

        // Print the result
        System.out.println(count);
    }

    public static int countSetBits(int number) {
        int count = 0;

        while (number != 0) {
            number &= (number - 1); // Flip the least significant set bit to 0
            count++;
        }

        return count;
    }
}
