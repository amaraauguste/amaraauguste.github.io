# Week 12 Answers

## Day 1

### Exercise 1

**Part a**

**Sequential (Linear) search:**

    2 5 8 12 16 23

**Part b**

**Binary search:**

| Low | Mid | High |
| --- | --- | --- |
| 2 | 16 | 91 |
| 23 | 56 | 91 |
| 23 | 23 | 38 |

### Exercise 2

**Sequential (Linear) search:**

    3 15 25 43

**Binary search:**

| Low | Mid | High |
| --- | --- | --- |
| 3 | 50 | 120 |
| 3 | 15 | 43 |
| 25 | 25 | 43 |
| 43 | 43 | 43 |

### Exercise 3

**Binary search:**

| Low | Mid | High |
| --- | --- | --- |
| 9 | 85 | 1000 |
| 9 | 23 | 78 |
| 9 | 9 | 15 |
| 15 | 15 | 15 |

### Exercise 4

    import java.util.Scanner;

    public class SearchMethods {

        public static int sequentialSearch(int[] numbers, int target) {
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == target) {
                    return i;
                }
            }

            return -1;
        }

        public static int binarySearch(int[] numbers, int target) {
            int low = 0;
            int high = numbers.length - 1;

            while (low <= high) {
                int middle = low + (high - low) / 2;

                if (numbers[middle] == target) {
                    return middle;
                } else if (target < numbers[middle]) {
                    high = middle - 1;
                } else {
                    low = middle + 1;
                }
            }

            return -1;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int[] numbers = {3, 15, 25, 43, 50, 76, 88, 102, 110, 120};

            System.out.print("Enter a number to search for: ");
            int target = sc.nextInt();

            int sequentialResult = sequentialSearch(numbers, target);
            int binaryResult = binarySearch(numbers, target);

            System.out.println("\nSequential Search:");
            if (sequentialResult == -1) {
                System.out.println(target + " was not found.");
            } else {
                System.out.println(target + " found at index " + sequentialResult);
            }

            System.out.println("\nBinary Search:");
            if (binaryResult == -1) {
                System.out.println(target + " was not found.");
            } else {
                System.out.println(target + " found at index " + binaryResult);
            }
        }
    }

---

## Week 12 Practice Exercises – Solutions

### Exercise 1: String Manipulation and Tracing

**Code output:**

    the 
    Welcome to Python Java programming course.
    20
    P
    false
    false
    updated is longer

**Answers:**

1. `first` contains `"the "` (including the trailing space).
2. `updated` contains `"Welcome to Python Java programming course."`.
3. `programming` begins at index `20` in `message`.
4. The character at index 11 of `updated` is `'P'`.
5. `message.compareTo(updated) < 0` evaluates to `false`. The first differing characters are `'t'` and `'P'`. Since `'t'` has a greater character value, `compareTo()` returns a positive number.
6. `message.equals(updated)` evaluates to `false` because the two strings are different.
7. The updated string is longer than the original string.

### Exercise 2: Method Tracing

**First method call:** `sumEvenNumbers(5)`

The loop examines the values 1 through 5. Only even values are added to `sum`.

| i | Is i even? | sum |
| --- | --- | --- |
| 1 | No | 0 |
| 2 | Yes | 2 |
| 3 | No | 2 |
| 4 | Yes | 6 |
| 5 | No | 6 |

The method returns `6`.

**Second method call:** `sumEvenNumbers(8)`

The even values from 1 through 8 are 2, 4, 6, and 8.

The method returns:

    2 + 4 + 6 + 8 = 20

**Answers:**

1. The first method call passes the argument `5`.
2. During the first call, `sum` changes from 0 to 2, then to 6. Odd values are skipped.
3. The first call returns `6`; the second call returns `20`.
4. Program output:

    6
    20

### Exercise 3: Linear and Binary Search

Given:

    int[] numbers = {4, 11, 19, 27, 36, 48, 64, 73, 81, 95, 108};

**Part A: Linear Search**

Values examined:

    4 11 19 27 36 48 64

The value `64` is found at index `6`.

**Part B: Binary Search**

| Step | Low | Mid | High | Value at Mid |
| --- | --- | --- | --- | --- |
| 1 | 0 | 5 | 10 | 48 |
| 2 | 6 | 8 | 10 | 81 |
| 3 | 6 | 6 | 7 | 64 |

The value `64` is found at index `6`.

### Exercise 4: Array Processing

**One possible solution:**

    public static int countEvenNumbers(int[] numbers) {
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                count++;
            }
        }

        return count;
    }

**Example:**

    int[] numbers = {3, 8, 12, 5, 7, 10, 15};

    System.out.println(countEvenNumbers(numbers));

**Output:**

    3

The even values are `8`, `12`, and `10`. The method counts these values and returns `3`. The original array is not modified.

### Exercise 5: File Input and Output

**One possible solution:**

    import java.util.Scanner;
    import java.io.File;
    import java.io.PrintWriter;

    public class ScoreSummary {

        public static void main(String[] args) throws Exception {

            Scanner input = new Scanner(new File("scores.txt"));

            int total = 0;
            int count = 0;
            int passingCount = 0;

            while (input.hasNextInt()) {
                int score = input.nextInt();

                total = total + score;
                count++;

                if (score >= 70) {
                    passingCount++;
                }
            }

            input.close();

            double average = 0;

            if (count > 0) {
                average = (double) total / count;
            }

            PrintWriter output = new PrintWriter("summary.txt");

            output.println("Total: " + total);
            output.printf("Average: %.2f%n", average);
            output.println("Passing scores: " + passingCount);

            output.close();

            System.out.println("Scores processed: " + count);
        }
    }

**Example input file (`scores.txt`):**

    85
    72
    58
    93
    64
    100

**Expected console output:**

    Scores processed: 6

**Expected contents of `summary.txt`:**

    Total: 472
    Average: 78.67
    Passing scores: 4

---

*Exam 2 review and Lab 5 to be discussed in class.*
