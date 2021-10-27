import java.util.Scanner;

// Question 14

public class ToFindNumberAlphabetOrSymbol {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any value:");
        char a = scanner.next().charAt(0);

        if (a>= '0' && a<= '9' )
        {
            System.out.println(a + " is a number");
        }
        else if ((a>= 'A' && a<= 'Z') || (a>= 'a' && a<= 'z'))
        {
            System.out.println(a + " is a Alphabet");
        }
        else
        {
            System.out.println(a + " is a Symbol");
        }

    }
}
