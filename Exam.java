import javax.swing.JOptionPane;

public class Exam extends Assessment implements Graded {
    private int numQuestions;
    private int numMissed;

    // Consturctor accepting the total questions and missed questions <<==
    public Exam(int totalQuestions, int questionsMissed) {
        numQuestions = totalQuestions;
        numMissed = questionsMissed;

        int theScore;
        try {
            theScore = 100 - (numMissed * getPointsEach());
        } catch (ArithmeticException e) {
            theScore = 0;
            JOptionPane.showMessageDialog(null, "Error: Number of questions cannot be zero.");
        }
        setScore(theScore);
    }

    // Method to find how many points each question is worth ##
    public int getPointsEach() {
        try {
            return 100 / numQuestions;
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "Error: Division by zero encountered. Number of questions must not be zero.");
            return 0;
        }
    }

    @Override
    public char getLetterGrade() {
        return getGrade();
    }

    public static int safeParseInt(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Please ennter a valid integer.");
            return -1;
        }
    }
}

interface Graded {
    char getLetterGrade();
}
