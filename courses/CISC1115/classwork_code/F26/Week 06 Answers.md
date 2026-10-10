# Week 06 – Answers

## Day 1

### 1. For Loop Exercises

**a.**

```java
for(int i = 1; i <= 20; i++){
   if(i % 2 == 0){
     System.out.println(i);
   }
}
```

**OR**

```java
for(int i = 2; i <= 20; i+=2){
   System.out.println(i);
}
```

**b.**

```java
for(int i = 30; i <= 50; i++) {
   if(i % 2 != 0) {
     System.out.println(i);
   }
}
```

**OR**

```java
for(int i = 31; i <= 50; i+=2) {
   System.out.println(i);
}
```

**c.**

```java
for(int i = 10; i > 0; i--) {
   System.out.println(i);
}
```

**d.**

```java
int sum = 0;
for(int i = 1; i <= 15; i++) { //runs 15 times
   sum += i * 5;
}
System.out.println(sum);
```

### 2.

```java
for (int i = 1; i <= 200; i++) {
    if (i % 2 == 0 && i % 3 == 0) {
        System.out.print(i + " ");
    }
}
```

### 3. Factors

```java
import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        System.out.print("Factors: ");

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }
}
```

### 4. Sum of Digits

```java
import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        int sum = 0;

        for (int i = number; i > 0; i /= 10) {
            sum += i % 10;
        }

        System.out.println("Sum of digits: " + sum);
    }
}
```

**Challenge:** Modify your program to also determine the largest digit in the number.

```java
import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        int sum = 0;
        int largest = 0;

        for (int i = number; i > 0; i /= 10) {
            int digit = i % 10;

            sum += digit;

            if (digit > largest) {
                largest = digit;
            }
        }

        System.out.println("Sum of digits: " + sum);
        System.out.println("Largest digit: " + largest);
    }
}
```

### 5. Multiplication Table

```java
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
```

---

## Exam Review and Lab 3

To be discussed in class.
