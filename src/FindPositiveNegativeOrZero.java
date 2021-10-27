import java.util.Scanner;

// Question 8

public class FindPositiveNegativeOrZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number =");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println(number + "is positive number");
        }
        if (number < 0) {
            System.out.println(number + "is negative number");
        }
        if (number == 0){
            System.out.println(number + "is zero");
        }
    }
}