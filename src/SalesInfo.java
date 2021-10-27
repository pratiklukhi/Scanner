import java.util.Scanner;

// Question 9

public class SalesInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("sales ID:");
        String ID = scanner.nextLine();
        System.out.println("Seller's name is:");
        String name = scanner.nextLine();
        System.out.println("basic salary is:");
        int basic_salary = scanner.nextInt();
        System.out.println("sales amount");
        int sales_amount = scanner.nextInt();

        int c;

        if (sales_amount>= 50000)
        {
           c= sales_amount*35/100;
            System.out.println("commission rate is:"+ c);
        }
        else if (sales_amount>= 30000)
        {
            c= sales_amount*20/100;
            System.out.println("commission rate is:"+ c);
        }
        else if (sales_amount>= 20000)
        {
            c= sales_amount*10/100;
            System.out.println("commission rate is:"+ c);
        }
        else if (sales_amount>=10000)
        {
            c= sales_amount*5/100;
            System.out.println("commission rate is:"+ c);
        }
        else
        {
            c = sales_amount * 2 / 100;
            System.out.println("commission rate is:" + c);
        }
    }
}
