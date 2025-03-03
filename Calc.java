import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        //Creating the calculator 
        Calc myCalculator = new Calc();
        Scanner scan = new Scanner(System.in);

        // Ask the user for two numbers
        double n1 = getValidNumber(scan, "Enter the first number: ");
        double n2 = getValidNumber(scan, "Enter the second number: ");

        // Storing the numbers inside the calculator
        myCalculator.setNum1(n1);
        myCalculator.setNum2(n2);

        // Show the numbers back to the user
        System.out.println(myCalculator);

        // Let's check what numbers are currently stored
        System.out.println("First number: " + myCalculator.getNum1());
        System.out.println("Second number: " + myCalculator.getNum2());

        // math stuffs 
        System.out.println("Sum: " + myCalculator.add());
        System.out.println("Difference: " + myCalculator.subtract());
        System.out.println("Product: " + myCalculator.multiply());
        System.out.println("Quotient: " + myCalculator.divide());
    }

    // this =method makes sure the user enters a real number
    private static double getValidNumber(Scanner scan, String prompt) {
        double number;
        while (true) {
            System.out.print(prompt);
            if (scan.hasNextDouble()) {
                number = scan.nextDouble();
                break;
            } else {
                System.out.println("Oops! That's not a number. Try again.");
                scan.next(); // Clear the invalid input
            }
        }
        return number;
    }
}
