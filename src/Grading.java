import java.util.Scanner;

// Question 3

public class Grading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Student name");
        String name = scanner.nextLine();
        System.out.println("Roll number");
        int number = scanner.nextInt();
        System.out.println("Marks of S1");
        int S1 = scanner.nextInt();
        System.out.println("Marks of S2");
        int S2 = scanner.nextInt();
        System.out.println("Marks of S3");
        int S3 = scanner.nextInt();
        int S = S1 + S2 + S3;
        double P = S/300.0 *100.0;
        String G = "";

        // Percentage and Grade calculation
        if (P>=80){
            G = "A+";
        }
        else if (P>=60){
            G = "A";
        }
        else if (P>=50){
            G = "B";
        }
        else if (P>=35){
            G = "C";
        }

        System.out.println("Total marks = " + S);
        System.out.println("Percentage =" + P);
        System.out.println("Grade =" + G);
    }
}