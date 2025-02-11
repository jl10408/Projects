public class Runner {
    public static void main(String[] args) {
        // Create an instance of the Tests class
        Tests testScores = new Tests();

        // Call method to get test scores and calculate average
        testScores.getAverage();

        // Print result using toString()
        System.out.println(testScores);
    }
}
