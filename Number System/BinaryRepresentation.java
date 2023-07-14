import java.util.Scanner;
public class BinaryRepresentation {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Convert the number to binary representation
        String binary = Integer.toBinaryString(number);

        // Print the binary representation
        System.out.println("Binary representation: " + binary);

      
    }
}
