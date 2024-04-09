import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class BowlingScores {
    public static void main(String [] args) throws Exception {
        int totalGroups = 0;
        int validGroups = 0;
        int invalidGroups = 0;

        File file = new File("scores.txt");
        Scanner sc = new Scanner(file);
        PrintWriter pw = new PrintWriter("results.txt");

        while (sc.hasNextInt()) {
            int score1 = sc.nextInt();
            int score2 = sc.nextInt();
            int score3 = sc.nextInt();

            totalGroups++;
            pw.println("Group #" + totalGroups + ": " + score1 + ", " + score2 + ", " + score3);
            boolean isValid = validGroup(score1, score2, score3, writer);
            if (isValid) {
                validGroups++;
                oneGameScore(score1, writer);
                oneGameScore(score2, writer);
                oneGameScore(score3, writer);

                int average = avg3Scores(score1, score2, score3);
                pw.println("Average of the three scores: " + average);
                oneGameScore(average, writer);

            } else {
                invalidGroups++;
            }
            pw.println();
            pw.println();
            pw.println();
        }

        pw.println("Total number of groups processed: " + totalGroups);
        pw.println("Number of valid groups: " + validGroups);
        pw.println("Number of invalid groups: " + invalidGroups);

        pw.close();
        sc.close();
    }

    public static boolean validGroup(int score1, int score2, int score3, PrintWriter pw) {
        boolean valid = true;

        if (score1 < 0) {
            pw.println("Invalid score: " + score1 + " - Must be greater than or equal to 0");
            valid = false;
        } else if (score1 > 300) {
            pw.println("Invalid score: " + score1 + " - Must be less than 300");
            valid = false;
        }
        if (score2 < 0) {
            pw.println("Invalid score: " + score2 + " - Must be greater than or equal to 0");
            valid = false;
        } else if (score2 > 300) {
            pw.println("Invalid score: " + score2 + " - Must be less than 300");
            valid = false;
        }
        if (score3 < 0) {
            pw.println("Invalid score: " + score3 + " - Must be greater than or equal to 0");
            valid = false;
        } else if (score3 > 300) {
            pw.println("Invalid score: " + score3 + " - Must be less than 300");
            valid = false;
        }


        if (valid) {
            pw.println("Valid group of scores.");
        } else {
            pw.println("Invalid group of scores.");
        }

        return valid;
    }

    public static void oneGameScore(int score, PrintWriter pw) {
        String rating = "";
        if (score >= 250) {
            rating = "Professional game";
        } else if (score >= 200) {
            rating = "Excellent game";
        } else if (score >= 140) {
            rating = "Very good game";
        } else if (score >= 100) {
            rating = "Good game";
        } else if (score >= 50) {
            rating = "Poor game";
        } else {
            rating = "Horrible game";
        }

        pw.println("Score: " + score + " - " + rating);
    }

    public static int avg3Scores(int score1, int score2, int score3) {
        return (score1 + score2 + score3) / 3;
    }
}
