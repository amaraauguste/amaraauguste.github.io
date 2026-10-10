# Week 01 Answers

## Day 1

### 1)

It allows us to express an algorithm.

### 2)

```java
int 123;       // Invalid (sequence of numbers)
int $50;       // Valid (but not conventional)
int 50dollars; // Invalid (starts with a number)
int abs;       // Valid
int hunter;    // Valid
int @60cents;  // Invalid (illegal character AND starts with a number)
int a_b;       // Valid
int #define;   // Invalid (illegal character)
```

### 3)

```java
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, my name is Amara Auguste.");
        System.out.println("How are you?");
    }
}
```

### 4)

```java
public class Arithmetic {
    public static void main(String[] args) {
        int a = 12; // Arbitrary
        int b = 10; // Can be whatever values you want

        System.out.println("When a is " + a + " and b is " + b);
        System.out.println("The sum of a and b is " + (a + b));
        System.out.println("The difference between a and b is " + (a - b));
        System.out.println("The product of a and b is " + (a * b));
        System.out.println("The quotient of a and b is " + (a / b)); // Integer division!
    }
}
```

### 5)

1. **Answer:** 23
2. First compute: `5 * 2 = 10`  
   Next: `4 + 10 = 14`  
   Then: `14 - 3 = 11`  
   **Answer:** 11
3. **Answer:** 16
4. **Result:** 13
5. `((8 - ((2 * 4) / 2)) + 3) = 7`
6. `b = 10 + (2 * 3 - 1) = 10 + (6 - 1) = 10 + 5 = 15`  
   **b = 15**

### 6)

**Memory:**

```text
a = 10
b = 27
c = (10 + 27) = 37
d = (10 - 27) = -17
e = (10 + 27 * 3) = (10 + 81) = 91
f = (27 / 2) = 13  // Integer division!
g = (27 % 10) = 7
```

**Output:**

```text
a is 10, b is 27
a+b is 37
a-b is -17
a+b*3 is 91
b/2 is 13
b%10 is 7
```

### 7)

```java
public class Rectangle {
    public static void main(String[] args) {
        int length = 22; // Arbitrary
        int width = 18;  // Can be anything
        int area = length * width; // (l * w)
        int perimeter = 2 * (length + width); // 2(l + w)

        System.out.println("Rectangle: length = " + length + " and width = " + width);
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }
}
```

### 8)

```java
public class Circle {
    public static void main(String[] args) {
        double radius = 7.5; // Arbitrary radius, value can be changed

        double area = Math.PI * radius * radius; // (πr²) OR Math.PI * Math.pow(radius, 2)
        double circumference = 2 * Math.PI * radius; // (2πr)

        System.out.println("Radius: " + radius);
        System.out.printf("Area: %.3f\n", area);
        System.out.printf("Circumference: %.3f\n", circumference);
    }
}
```

---

## Day 2

### 1)

```java
public class TemperatureConverter {
    public static void main(String[] args) {
        double f = 255.5;

        // Convert Fahrenheit to Celsius
        double c = (f - 32) * 5.0 / 9.0;

        // Print temperature in Celsius
        System.out.println(f + " degree(s) Fahrenheit is equal to " + c + " degree(s) Celsius.");
    }
}
```

### 2)

```text
-9 4 2.00
```

### 3)

This is a perfectly legal statement because the class name `Math` allows Java to distinguish between the variable `sqrt` and the method `sqrt`.

However, we should avoid having multiple aspects of a program with the same name, as it may cause confusion.

### 4)

```java
(Math.pow(x, 2) - (1 / (y + 3))) / ((1 / z) + Math.sqrt(x))
```
