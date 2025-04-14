
import java.io.*;
import java.text.DecimalFormat;

public class Lab8 {
    public static void main(String[] args) {
        String inputFile = "pay.csv";
        String outputFile = "output.csv";

        try (
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))
        ) {
            String line;
            DecimalFormat df = new DecimalFormat("$#,##0.00");

            // Write column headers to the output file
            writer.write("Name,Pay Rate,Hours Worked,Weekly Pay");
            writer.newLine();

            // Read each line from the input file
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");

                // Skip lines that don't have enough data
                if (parts.length < 3) continue;

                String name = parts[0];
                double payRate = Double.parseDouble(parts[1]);
                double hoursWorked = Double.parseDouble(parts[2]);

                double weeklyPay = 0.0;

                // Calculate weekly pay, including overtime if over 40 hours
                if ((hoursWorked > 40)) {
                    double overtime = hoursWorked - 40;
                    weeklyPay = (40 * payRate) + (overtime * payRate * 1.5);
                } else {
                    weeklyPay = hoursWorked * payRate;
                }

                // Write the line to the output file with formatted pay
                String outputLine = name + "," + payRate + "," + hoursWorked + "," + df.format(weeklyPay);
                writer.write(outputLine);
                writer.newLine();
            }

            System.out.println("Output written to " + outputFile);
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + e.getMessage());
        }
    }
}
