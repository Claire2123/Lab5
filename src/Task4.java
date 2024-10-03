import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their age
        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();

        // Check if the user is 21 or older
        if (age >= 21) {
            System.out.println("You get a wrist band.");
        }

        scanner.close(); // Close the scanner
    }
}










