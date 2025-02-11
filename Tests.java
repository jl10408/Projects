import java.util.Scanner;

public class Tests {
    private int sum;
    private int count;
    private double average;

    // Constructor
    public Tests() {
        this.sum = 0;
        this.count = 0;
        this.average = 0.0;
    }

    // Method to calculate average (void return type as required)
    public void getAverage() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter test scores (enter -1 to quit): ");

        int score = scanner.nextInt();
        while (score != -1) {
            sum += score;
            count++;
            System.out.println("Enter test scores (enter -1 to quit): ");
            score = scanner.nextInt();
        }
        
        if (count > 0) {
            average = (double) sum / count;
        } else {
            average = Double.NaN; // No valid scores entered
        }

        scanner.close();
    }

    // toString() method to display results
    public String toString() {
        return "The average of " + count + " test scores is: " + String.format("%.2f", average);
    }
}
