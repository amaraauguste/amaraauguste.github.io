# Exam 1 Practice Questions: Answers

These are sample solutions. Other correct approaches are possible.

---

## Part A: Debugging and Understanding Code

### 1) Rectangle Area

**Logical error:** The code adds the length and width instead of multiplying them. It compiles and runs, but calculates the wrong result.

```java
int length = 8;
int width = 5;

int area = length * width;

System.out.println("Area: " + area);
```

**Output:** `Area: 40`

### 2) Printing Numbers 1 Through 5

**Logical error (infinite loop):** `i` is never incremented, so `i <= 5` remains true.

```java
int i = 1;

while (i <= 5) {
    System.out.println(i);
    i++;
}
```

**Output:**

```text
1
2
3
4
5
```

### 3) Pass/Fail Conditional

**Compiler/syntax error:** The semicolon immediately after `if (score >= 60)` ends the `if` statement. The following block is unconditional, and the `else` has no matching `if`.

```java
int score = 75;

if (score >= 60) {
    System.out.println("Passed");
}
else {
    System.out.println("Failed");
}
```

**Output:** `Passed`

---

## Part B: Arithmetic Expressions

### 4) Mathematical Expressions in Java

**a.** \(y = (3x^2 + 5)/(2x + 1)\)

```java
y = (3 * Math.pow(x, 2) + 5) / (2 * x + 1);
```

**b.** \(z = \sqrt{a^2 + b^2}\)

```java
z = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
```

**c.** \(w = (|x - 10| + 4y^3)/5\)

```java
w = (Math.abs(x - 10) + 4 * Math.pow(y, 3)) / 5;
```

These assignments assume `y`, `z`, and `w` have compatible types (typically `double`). `Math.pow()` and `Math.sqrt()` return `double` values.

### 5) Evaluating Expressions

Given:

```java
int a = 17;
int b = 5;
double c = 5.0;
```

| Expression | Result | Explanation |
|---|---:|---|
| `a / b` | `3` | Integer division truncates the fractional part. |
| `a % b` | `2` | Remainder after dividing 17 by 5. |
| `a / c` | `3.4` | Division uses floating-point arithmetic because `c` is `double`. |
| `2 + 3 * 4 - 6 / 2` | `11` | Multiplication and division occur before addition and subtraction. |
| `(a + b) / 2.0` | `11.0` | `(17 + 5) / 2.0 = 11.0`. |

---

## Part C: Tracing Code and Boolean Expressions

### 6) Tracing Variables and Conditionals

Initially, `a = 4` and `b = 9`.

- `a < b` is true, so `a = 4 + 5 = 9`.
- `a == b` is now true, so `b = 9 * 2 = 18`.
- The `else` block is skipped.

**Exact output:**

```text
a = 9
b = 18
```

### 7) Boolean Expressions

Given `x = 6`, `y = 10`, and `z = 3`:

| Expression | Result | Explanation |
|---|---|---|
| `x < y && z > 5` | `false` | `true && false` is false. |
| `x == 6 || y < 5` | `true` | `true || false` is true. |
| `!(x > z)` | `false` | `x > z` is true; negating it gives false. |
| `x + z >= y` | `false` | `6 + 3` is 9, which is less than 10. |
| `(x < y && z < x) || y == 0` | `true` | `(true && true) || false` is true. |

### 8) Tracing a For Loop

| `i` | Action | `total` after iteration |
|---:|---|---:|
| 1 | Odd: `total++` | 1 |
| 2 | Even: `total += 2` | 3 |
| 3 | Odd: `total++` | 4 |
| 4 | Even: `total += 4` | 8 |
| 5 | Odd: `total++` | 9 |

**Exact output:**

```text
9
```

---

## Part D: Conditionals and Loops

### 9) Positive, Negative, or Zero

```java
import java.util.Scanner;

public class NumberSign {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = stdin.nextInt();

        if (number > 0) {
            System.out.println("Positive");
        }
        else if (number < 0) {
            System.out.println("Negative");
        }
        else {
            System.out.println("Zero");
        }

        stdin.close();
    }
}
```

### 10) Day of the Week Using Switch

This solution assumes **1 = Sunday**, **2 = Monday**, and so on through **7 = Saturday**. Other mappings are acceptable if stated and used consistently.

```java
import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        System.out.print("Enter a day number (1-7): ");
        int day = stdin.nextInt();

        switch (day) {
            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Wednesday");
            case 5 -> System.out.println("Thursday");
            case 6 -> System.out.println("Friday");
            case 7 -> System.out.println("Saturday");
            default -> System.out.println("Invalid day");
        }

        stdin.close();
    }
}
```

### 11) Sum Until Sentinel 0

```java
import java.util.Scanner;

public class SentinelSum {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int sum = 0;

        System.out.print("Enter a number (0 to stop): ");
        int number = stdin.nextInt();

        while (number != 0) {
            sum += number;

            System.out.print("Enter a number (0 to stop): ");
            number = stdin.nextInt();
        }

        System.out.println("Sum: " + sum);
        stdin.close();
    }
}
```

For inputs `5`, `8`, `3`, and `0`, the sum is `16`. The sentinel is not included.

### 12) Nested Loop Number Pattern

```java
public class NumberPattern {
    public static void main(String[] args) {
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
```

**Output:**

```text
1
12
123
1234
12345
```

---

## Part E: File Input/Output

### 13) Sum All Integers in a File (EOF Loop)

```java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileSum {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("numbers.txt"));
        int sum = 0;

        while (input.hasNextInt()) {
            int number = input.nextInt();
            sum += number;
        }

        System.out.println("Sum: " + sum);
        input.close();
    }
}
```

`hasNextInt()` checks whether another integer is available. The loop ends when there are no more integers to read. The file has **no header value** in this question.

### 14) Highest Temperature Using a Header and For Loop

Example `temperatures.txt`:

```text
4
72
68
75
81
```

```java
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class HighestTemperature {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("temperatures.txt"));
        PrintWriter output = new PrintWriter("highest.txt");

        int count = input.nextInt();
        int highest = input.nextInt();

        for (int i = 1; i < count; i++) {
            int temperature = input.nextInt();

            if (temperature > highest) {
                highest = temperature;
            }
        }

        output.println("Highest temperature: " + highest);

        input.close();
        output.close();
    }
}
```

Because the file is guaranteed to contain at least one temperature, the first temperature initializes `highest`. The loop then processes the remaining `count - 1` values.

**Contents of `highest.txt`:**

```text
Highest temperature: 81
```

---

## Part F: Complete Programming Practice

### 15) Store Transactions and Shipping Charges

```java
import java.util.Scanner;

public class StoreTransactions {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        System.out.print("Enter item number (0 to stop): ");
        int itemNumber = stdin.nextInt();

        while (itemNumber != 0) {
            System.out.print("Enter quantity: ");
            int quantity = stdin.nextInt();

            System.out.print("Enter price per item: ");
            double price = stdin.nextDouble();

            double totalCost = quantity * price;
            double shipping;

            if (totalCost < 25) {
                shipping = 5.00;
            }
            else if (totalCost < 75) {
                shipping = 3.00;
            }
            else {
                shipping = 0.00;
            }

            double finalAmount = totalCost + shipping;

            System.out.println("Item number: " + itemNumber);
            System.out.printf("Total cost: $%.2f%n", totalCost);
            System.out.printf("Shipping charge: $%.2f%n", shipping);
            System.out.printf("Final amount: $%.2f%n", finalAmount);

            System.out.print("Enter item number (0 to stop): ");
            itemNumber = stdin.nextInt();
        }

        stdin.close();
    }
}
```

**Example:** Item number `123`, quantity `3`, price `$20.00` per item:

```text
Item number: 123
Total cost: $60.00
Shipping charge: $3.00
Final amount: $63.00
```

The program prompts for the next item number after each transaction. Entering `0` ends the loop without requesting a quantity or price.

---

## Additional Review Questions: Answers

1. **`=` vs. `==`:** `=` assigns a value to a variable; `==` compares two values for equality and produces a Boolean result.
2. **`nextInt()` vs. `nextDouble()`:** `nextInt()` reads an integer; `nextDouble()` reads a floating-point number as a `double`. For example, entering `3.5` for `nextInt()` causes an input mismatch exception.
3. **Dividing two integers:** Java performs integer division, discarding the fractional portion. For example, `7 / 2` evaluates to `3`, not `3.5`.
4. **`print()`, `println()`, and `printf()`:** `print()` displays text without automatically moving to a new line; `println()` adds a line break; `printf()` displays formatted output using format specifiers such as `%.2f`.
5. **`while` vs. `for`:** A `while` loop is useful when the number of repetitions is not known in advance (for example, reading until a sentinel). A `for` loop is useful when counting through a known range or number of repetitions.
6. **Sentinel vs. file header:** A sentinel is a special input value that signals when processing should stop; a header value appears at the beginning of a file and can indicate how many data records follow.
7. **`while` vs. `do-while`:** `while` checks the condition before executing its body, so it may run zero times. `do-while` checks afterward, so its body runs at least once.
8. **Missing `break` in traditional `switch`:** Execution can fall through into subsequent cases until a `break` or the end of the `switch` is reached. Arrow-style switch cases do not fall through.
9. **Closing `PrintWriter`:** Closing it flushes buffered output and releases the file resource. Without closing or flushing, some output may not be written to the file.
10. **Compiler vs. logical error:** A compiler error prevents the program from compiling (such as an unmatched `else`); a logical error allows the program to run but produces an incorrect result (such as adding instead of multiplying to calculate area).
