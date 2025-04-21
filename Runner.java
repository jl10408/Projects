import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        // create scanner to get input from user
        Scanner scanner = new Scanner(System.in); // scnner was mispelled before lol

        System.out.print("Enter the number of disks: ");
        int disks = scanner.nextInt(); // getting user input

        // new instance of Towers class
        Towers myTowerSolver = new Towers();

        // try to solve hanoi problem
        myTowerSolver.solve(disks, "A", "C", "B");

        // just in case
        scanner.close();
    }
}
