import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Random_Generated_String {

    public static void main(String[] args) throws FileNotFoundException {
        char start = 32; //start from whitespace (' ')
        char end = 126; //end at tilde ('~'')

        String s = "";

        //generate 100 random characters and add to String 
        for (int i = 0; i < 50; i++) {
            int random = (int) (Math.random() * (end - start) + start);
            s += (char) random;
        }

        PrintWriter pw = new PrintWriter(new File("stringStats.txt"));

        pw.println("Randomly Generated string: " + s);

        //Counters
        int numLetter = 0;
        int numLowerCase = 0;
        int numUpperCase = 0;
        int numVowel = 0;
        int numConsonant = 0;
        int numDigit = 0;
        int numEven = 0;
        int numOdd = 0;
        int numChar = 0;

        for (int j = 0; j < s.length(); j++) {
            char c = s.charAt(j);
            if (Character.isLetter(c)) {
                numLetter++;
                if (Character.isLowerCase(c)) {
                    numLowerCase++;
                } else { //if not lowercase, then automatically uppercase
                    numUpperCase++;
                }

                //convert to lowercase to make checking simpler
                c = Character.toLowerCase(c);

                //check if vowel
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    numVowel++;
                } else { //if not vowel, then automatically consonant
                    numConsonant++;
                }

            } else if (Character.isDigit(c)) {
                numDigit++;

                //cast to int to evaluate even/odd
                int d = (int) c;

                if (d % 2 == 0) {
                    numEven++;
                } else { //if not even, then odd
                    numOdd++;
                }
            } else { //if not a letter or a digit
                numChar++;
            }

        }

        pw.println("\nNumber of Letters: " + numLetter);
        pw.println("\tNumber of Lowercase Letters: " + numLowerCase);
        pw.println("\tNumber of Uppercase Letters: " + numUpperCase);
        pw.println("\tNumber of Vowels: " + numVowel);
        pw.println("\tNumber of Consonants: " + numConsonant);
        pw.println("\nNumber of Digits: " + numDigit);
        pw.println("\tNumber of Even Digits: " + numEven);
        pw.println("\tNumber of Odd Digits: " + numOdd);
        pw.println("\nNumber of Other Characters: " + numChar);
        pw.println("\nTotal number of characters in String: " + s.length());

        pw.close();

    }
}
