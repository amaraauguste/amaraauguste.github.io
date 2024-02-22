import java.util.Scanner;

public class MY11Lab1Modified {

    public static void main(String [] args) { 
        System.out.println("***********************");
        System.out.println("*  Choose a question  *");
        System.out.println("***********************");
        System.out.println("*     Question 2      *");
        System.out.println("*     Question 5      *");
        System.out.println("*     Question 7      *");
        System.out.println("*     Question 8      *");
        System.out.println("***********************");
        System.out.println();

        Scanner sc = new Scanner(System.in); //create Scanner obj

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        if (choice == 2) {
            System.out.println("***********************");
            System.out.println("Question 2:");
            System.out.println("***********************");
            int a, b; //declaration

            System.out.print("Enter first number: "); //prompts DO NOT go to files
            a = sc.nextInt(); //hardcoded value -- does NOT allow user interaction
            System.out.print("Enter second number: ");
            b = sc.nextInt();
            System.out.println();
            System.out.printf("The values are %d and %d%n", a, b);
            System.out.printf("The sum of %d" + " and %d" + " is %d%n", a, b, (a + b));
            System.out.printf("The difference between %d and %d is %d%n", a, b, (a - b));
            System.out.printf("The quotient of %d and %d is %.2f%n", a, b, (((double) a) / b));
            System.out.printf("The product of %d and %d  is  %d%n", a, b, (a * b));
        } else if (choice == 5) {
            System.out.println("***********************");
            System.out.println("Question 5");
            System.out.println("***********************");
            System.out.print("Enter rectangle length: ");
            int length = sc.nextInt();
            System.out.print("Enter rectangle width: ");
            int width = sc.nextInt();
            System.out.println();
            int area = length * width; //(l * w)
            int perimeter = 2 * (length + width); //2(l + w)
            System.out.printf("Rectangle: length = %d and width = %d%n", length, width);
            System.out.printf("Area = %d%n", area);
            System.out.printf("Perimeter = %d%n", perimeter);

        } else if (choice == 7) {
            System.out.println("***********************");
            System.out.println("Question 7");
            System.out.println("***********************");
            System.out.print("Enter temperature in fahrenheit: ");
            double f = sc.nextDouble();
            System.out.println();
            // Convert Fahrenheit to Celsius
            double c = (f - 32) * 5 / 9;

            // Print temperature in Celsius 
            System.out.printf("%.2f degree(s) Fahrenheit is equal to %.2f degree(s) Celsius.%n", f, c);

        } else if (choice == 8) {
            System.out.println("***********************");
            System.out.println("Question 8");
            System.out.println("***********************");
            System.out.print("Enter circle radius: ");
            double radius = sc.nextDouble(); //arbitrary radius, value can be changed
            System.out.println();
            double circleArea = Math.PI * radius * radius; //(Ï€r^2) OR Math.PI * Math.pow(radius,2)

            double circumference = 2 * Math.PI * radius; //(2Ï€r) 

            System.out.printf("Radius: %.3f%n", radius);
            System.out.printf("Area: %.3f%n", circleArea);
            System.out.printf("Circumference: %.3f\n", circumference);
        } else {
            System.out.println("Invalid selection.");
        }

        sc.close(); //close to avoid memory leak
    }
}
