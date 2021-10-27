import java.util.Scanner;

// Question 7

public class AverageNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Average of these five numbers =");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        double e = scanner.nextDouble();

        // Calculate an average of five numbers
        double A = (a + b + c + d + e)/5;
        System.out.println("Average is " + A );
    }
}
