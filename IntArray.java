
import java.util.Arrays;
import java.util.Random;

public class IntArray {

    
    private int length;
    private int[] myArray;

    
    public IntArray(int length) {
        this.length = length;
        myArray = new int[length];
    }

    // Method to get length of the array
    public int size() {
        return length;
    }

    // Method to fiill the array with random integers from 1 to 6
    public void fillRand() {
        Random randomGenerator = new Random();
        for (int i = 0; i < length; i++) {
            myArray[i] = randomGenerator.nextInt(6) + 1;
        }
    }

    // This Method to update the value at a specific position in the array
    public void set(int position, int value) {
        if (position >= 0 && position < length) {
            myArray[position] = value;
        }
    }

    // This is a Method to retrieve the value at a specific position
    public int get(int position) {
        if (position >= 0 && position < length) {
            return myArray[position];
        } else {
            return -1; // Indicates an invalid position
        }
    }

    // Method to clear the array and reset its length
    public void clear() {
        length = 0;
        myArray = new int[0];
    }

    // Method to check if the array is or is empty
    public boolean isEmpty() {
        return length == 0;
    }

    // Method to sort the array elements in ascending order
    public void sort() {
        Arrays.sort(myArray);
    }

    // Overriding toString 
    @Override
    public String toString() {
        return Arrays.toString(myArray);
    }
}
