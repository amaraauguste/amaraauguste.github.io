import java.util.Scanner;
public class ValidateInput {

    public static void main(String [] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number: ");
        if (!sc.hasNextInt()) {
            String invalid = sc.next();
            System.out.println(invalid + " is not a valid input");
        } else {
            int x = sc.nextInt();

            if (x > 0) {
                System.out.println("x is positive");
            } else if (x < 0) {
                System.out.println("x is negative");
            } else {
                System.out.println("x is zero");
            }
        }
    }
}
