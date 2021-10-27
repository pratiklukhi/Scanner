import java.util.Scanner;

// Question 10

public class CityName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any alphabet:");
        char city = scanner.next().charAt(0);

        if (city=='a')
        {
            System.out.println("Amreli");
        }
        else if (city=='b')
        {
            System.out.println("Bristol");
        }
        else if (city=='c')
        {
            System.out.println("Chennai");
        }
        else if (city=='d')
        {
            System.out.println("Delhi");
        }
        else if (city=='e')
        {
            System.out.println("Ealing");
        }
        else if (city=='f')
        {
            System.out.println("Finchley");
        }
        else
        {
            System.out.println("Invalid Entry");
        }
    }
}
