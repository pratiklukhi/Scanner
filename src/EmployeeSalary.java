import java.util.Scanner;

// Question 6

public class EmployeeSalary {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Employee's Id");
    String number = scanner.nextLine();
    System.out.println("Employee's Name");
    String name = scanner.nextLine();
    System.out.println("Employee's basic salary");
    double basic_salary = scanner.nextDouble();
    double HRA = basic_salary*10/100;
    System.out.println("Employee's HRA: "+HRA+"");
    double DA = basic_salary*8/100;
    System.out.println("Employee's DA: "+DA+"");
    double TA = basic_salary*9/100;
    System.out.println("Employee's TA: "+TA+"");
    double PF = basic_salary*20/100;
    System.out.println("Employee's PF: "+PF+"");
    double Gross_salary = basic_salary + HRA + DA + TA - PF;
    System.out.println("Gross salary: "+Gross_salary+"");
}
}
