import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their party affiliation
        System.out.print("Please enter your party affiliation (D for Democrat, R for Republican, I for Independent): ");
        String input = scanner.nextLine().toUpperCase(); // Read input and convert to uppercase

        // Determine the party affiliation using a cascaded if structure
        if (input.equals("D")) {
            System.out.println("You get a Democratic Donkey.");
        } else if (input.equals("R")) {
            System.out.println("You get a Republican Elephant.");
        } else if (input.equals("I")) {
            System.out.println("You get an Independent Person.");
        } else {
            System.out.println("You get an Other.");
        }

        scanner.close(); // Close the scanner
    }
}




