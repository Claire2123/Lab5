import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your birth month (1-12): ");

        // Read user input
        int month = scanner.nextInt();

        // Check if the input is in the valid range
        if (month >= 1 && month <= 12) {
            System.out.println("Your birth month is: " + month);
        } else {
            System.out.println("You entered an incorrect month value: " + month);
        }

        scanner.close(); // Close the scanner
        }
    }




















