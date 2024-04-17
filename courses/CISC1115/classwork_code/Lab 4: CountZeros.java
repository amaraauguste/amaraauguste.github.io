import java.io.*;
import java.util.*;

public class CountZeros {
    public static void main(String [] args) throws Exception {
        int [] numbers = new int[100];
        PrintWriter pw = new PrintWriter("results.txt");
        int size = readData(numbers, pw);

        int zerosCount = countZeros(size, numbers);
        pw.println("Number of zeros in the initial array: " + zerosCount);

        size = append(size, numbers);
        pw.println("\nUpdated array:");
        for (int i = 0; i < size; i++) {
            pw.print(numbers[i] + " ");
        }
        pw.println();
        pw.println("New total number of data values stored in the array: " + size);

        int newZerosCount = countZeros(size, numbers);
        pw.println("Number of zeros in the updated array: " + newZerosCount);

        pw.close();

    }

    public static int readData(int [] vals, PrintWriter pw) throws Exception {
        int count = 0;
        Scanner scanner = new Scanner(new File("initNums.txt"));
        while (scanner.hasNextInt()) {
            vals[count] = scanner.nextInt();
            count++;
        }
        pw.println("Data values read:");
        for (int i = 0; i < count; i++) {
            pw.print(vals[i] + " ");
        }
        pw.println();
        pw.println("Total number of data values read: " + count);

        scanner.close();

        return count;
    }

    public static int countZeros(int n, int [] vals) {
        int zerosCount = 0;
        for (int i = 0; i < n; i++) {
            if (vals[i] == 0) {
                zerosCount++;
            }
        }
        return zerosCount;
    }

    public static int append(int n, int [] vals) throws Exception {
        Scanner scanner = new Scanner(new File("moreNums.txt"));

        while (scanner.hasNextInt() && n < vals.length) {
            vals[n] = scanner.nextInt();
            n++;
        }

        scanner.close();

        return n;
    }
}
