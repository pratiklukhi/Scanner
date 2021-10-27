import java.util.Scanner;

// Question 13

public class NumberWithSymbol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter two value:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("value of a:" + a);
        System.out.println("value of b:" + b);

        System.out.println("Please enter any symbol (+,-,/,*)");
        char symbol = scanner.next().charAt(0);

        if (symbol == '+')
        {
           int add;
           add = a+b;
            System.out.println("Addition of two value is: " + add);
        }
        else if (symbol == '-')
        {
            int sub;
            sub = a-b;
            System.out.println("Substraction of two value is:" + sub);
        }
        else if (symbol == '/')
        {
            float div;
            div = a/b;
            System.out.println("Division of two value is:" + div);
        }
        else
        {
            float multi;
            multi = a*b;
            System.out.println("Multuplication of two value is:" + multi);
        }
    }
}
