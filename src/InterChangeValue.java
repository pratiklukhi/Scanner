import java.util.Scanner;

// Question 5

public class InterChangeValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of a and b");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c;
        System.out.println("Before interchange value is: "+a+" "+b+"");

        //Interchange
        c = b;
        b = a;
        a = c;
        System.out.println("After interchange value is:"+a+" "+b+"");

    }

}
