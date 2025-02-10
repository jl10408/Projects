import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // First Pet object using default constructor
        Pet pet1 = new Pet();
        System.out.println(pet1);

        // Second Pet object using custom constructor
        Pet pet2 = new Pet("Buster", "Dog", 11);
        System.out.println("\n" + pet2);

        // Third Pet object with user input
        System.out.println("\nEnter animal type:");
        String type = scanner.nextLine();

        System.out.println("Enter animal name:");
        String name = scanner.nextLine();

        System.out.println("Enter animal age:");
        int age = scanner.nextInt();

        Pet pet3 = new Pet(name, type, age);
        System.out.println("\n" + pet3);

        scanner.close();
    }
}
