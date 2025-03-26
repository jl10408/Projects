import java.util.ArrayList;

public class Asn5 {
    public static void main(String[] args) {

        // ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");

        // ArrayList of Integers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        // Dispaly fruits
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Dispaly numbers
        numbers.forEach(num -> System.out.println(num));

        // Modify fruits and numbers
        fruits.remove("Banana");
        fruits.set(0, "Apricot");

        numbers.add(1, 15);
        numbers.remove(Integer.valueOf(30));

        // Dispaly modified fuits
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Dispaly modified numbers
        numbers.forEach(num -> System.out.println(num));
    }
}
