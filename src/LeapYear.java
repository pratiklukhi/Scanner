import java.util.Scanner;

// Question 2

public class LeapYear {
    public static void main(String[] args)
{
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter any year");
    int year = scanner.nextInt();

    // year divided by 4
    if (year%4 == 0)
    {
        System.out.println("It is a Leap year");
    }
    else
    {
        System.out.println("It is not a Leap year");
    }
}
}

