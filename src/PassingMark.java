import java.util.Scanner;

// Question 4

public class PassingMark {
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

    if(S1>=35 && S2>=35 && S3>=35){
        System.out.println("Student is pass in all the subjects");
    }
    else{
        System.out.println("Student is failed");
    }
}
}
