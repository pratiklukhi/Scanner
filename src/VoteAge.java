import java.util.Scanner;

// Question 11

public class VoteAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the age:");
        int age =scanner.nextInt();

        if (age>=18)
        {
            System.out.println("Eligible for vote");
        }
        else
        {
            System.out.println("Not eligible for vote");
        }
    }
}
