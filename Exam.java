public class Exam extends Assessment {
    private int numQuestions;
    private int numMissed;

    // Consturctor accepting the total questions and missed questions <<==
    public Exam(int totalQuestions, int questionsMissed) {
        numQuestions = totalQuestions;
        numMissed = questionsMissed;

        // Calculating and setting the score **
        int theScore = 100 - (numMissed * getPointsEach());
        setScore(theScore);
    }

    // Method to find how many points each question is worth ##
    public int getPointsEach() {
        return 100 / numQuestions;
    }
}
