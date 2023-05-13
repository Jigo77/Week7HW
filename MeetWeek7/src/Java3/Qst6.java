package Java3;

import java.util.Scanner;

public class Qst6 {
    //6. WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Grosssalary
    // HRA = basic salary 10%
    // DA = Basic salary 8%
    // TA = Basic salary 9%
    //PF= Basic salary 20%
    //  Gross salary = basic salary + HRA + TA + DA –PFPrint in following format

    public static void main(String[] args) {
        sal();
    }
    public static void sal(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Id :");
        int a = sc.nextInt();
        System.out.println("Enter Name :");
        String b = sc.next();
        System.out.println("Enter Basic Salary :");
        double c = sc.nextDouble();

        double hra = c*10/100;
        double da = c*8/100;
        double ta = c*9/100;
        double pf = c*20/100;

        double cal = c+hra+da+ta-pf;

        System.out.println("|_________________________________________|");
        System.out.println("|                 Salary Slip             |");
        System.out.println("|_________________________________________|");
        System.out.println("|   Employee ID          :  "+a+"       |");
        System.out.println("|   Employee Name        :  "+b+"       |");
        System.out.println("|_________________________________________|");
        System.out.println("|   Basic Salary         :  "+c+"       |");
        System.out.println("|   HRA 10%              :  "+hra+"     |");
        System.out.println("|   DA 8%                :  "+da+"     |");
        System.out.println("|   TA 9%                :  "+ta+"     |");
        System.out.println("|   PF 20%               :  "+pf+"     |");
        System.out.println("|_________________________________________|");
        System.out.println("|   Gross Salary         :  "+cal+"     |");
        System.out.println("|_________________________________________|");
    }
}
