# Week 12 Answers

## Day 1

### Exercise 1

**Part a**

**Sequential (Linear) search:**

```text
2 5 8 12 16 23
```

**Part b**

**Binary search:**

| Low | Mid | High |
| --- | --- | --- |
| 2 | 16 | 91 |
| 23 | 56 | 91 |
| 23 | 23 | 38 |

### Exercise 2

**Sequential (Linear) search:**

```text
3 15 25 43
```

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

```java
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
```

---

*Exam 2 review and Lab 5 to be discussed in class.*
