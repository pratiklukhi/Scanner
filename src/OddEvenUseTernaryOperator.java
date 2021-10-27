import java.util.Scanner;

// Question 1

public class OddEvenUseTernaryOperator {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input first number =");
        int number = scanner.nextInt();
        System.out.println("Please input second number =");
        int value = scanner.nextInt();

        //use ternary operator to check number even or odd
        String check = number%2==0 ? "Even" : "Odd";
        System.out.println(number + "is" + check);
        String result = value%2==0 ? "Even" : "Odd";
        System.out.println(value + "is" + result);
    }
}
