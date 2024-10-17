package com.nowhere.sortbooks;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class SortBooks {

    public static void main(String[] args) throws Exception {
        // File containing book entries (input)
        String inputFileName = "books.txt";

        // Initialize the scanner for reading the book file
        Scanner input = new Scanner(new File(inputFileName));

        // Initialize the PrintWriter for each genre file
        PrintWriter fictionWriter = new PrintWriter("Fiction.txt");
        PrintWriter nonFictionWriter = new PrintWriter("NonFiction.txt");
        PrintWriter sciFiWriter = new PrintWriter("SciFi.txt");
        PrintWriter mysteryWriter = new PrintWriter("Mystery.txt");
        PrintWriter romanceWriter = new PrintWriter("Romance.txt");

        // Read the book entries until end of file
        while (input.hasNext()) {
            int bookID = input.nextInt(); // Read Book ID
            input.nextLine(); // Clear buffer

            String title = input.nextLine(); // Read Title
            String author = input.nextLine(); // Read Author
            int genreNum = input.nextInt(); // Read Genre Number
            //input.nextLine(); // Clear buffer

 
            // Write to the appropriate genre file
            if (genreNum == 1) {
                fictionWriter.printf("Book ID: %d\tTitle: %s\tAuthor: %s\n\n",
                                     bookID, title, author);
            } else if (genreNum == 2) {
                nonFictionWriter.printf("Book ID: %d\tTitle: %s\tAuthor: %s\n\n",
                                     bookID, title, author);
            } else if (genreNum == 3) {
                sciFiWriter.printf("Book ID: %d\tTitle: %s\tAuthor: %s\n\n",
                                     bookID, title, author);
            } else if (genreNum == 4) {
                mysteryWriter.printf("Book ID: %d\tTitle: %s\tAuthor: %s\n\n",
                                     bookID, title, author);
            } else if (genreNum == 5) {
                romanceWriter.printf("Book ID: %d\tTitle: %s\tAuthor: %s\n\n",
                                     bookID, title, author);
            } 
        }

        // Close all writers and scanner
        input.close();
        fictionWriter.close();
        nonFictionWriter.close();
        sciFiWriter.close();
        mysteryWriter.close();
        romanceWriter.close();
    }
}
