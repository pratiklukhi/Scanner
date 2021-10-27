import java.util.Scanner;

// Question 12

public class UpperAndLowerCaseAlphabet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("To write upper case alphabet to get lower case alphabet:");
        String alphabet = scanner.nextLine();

        System.out.println("Lowercase Alphabet:" + alphabet.toLowerCase());

    }
}
