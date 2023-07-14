import java.util.Scanner;
public class OddEvenCheck {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a number to check odd or even: ");
        int number = scanner.nextInt();

        // Check if the number is odd or even
        boolean isEven = checkEven(number);

        // Print the result
        System.out.println(isEven);
    }

    public static boolean checkEven(int number) {
        // Perform bitwise AND operation with 1
        // If the result is 0, the number is even; otherwise, it is odd
        return (number & 1) == 0;
    }
}
