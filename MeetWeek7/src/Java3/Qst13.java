package Java3;

import java.util.Scanner;

public class Qst13 {
    //13. Write a java program to input any two number and ask user to enter their symbol (+, -, /, *)
    //find addition, Subtraction, multiplication and division according to theirsymbol(using if else)

    public static void main(String[] args) {
        sum();
    }
    public static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 Number :");
        int num1 = sc.nextInt();

        System.out.println("Enter 2 Number :");
        int num2 = sc.nextInt();

        System.out.println("Enter Symbol(+,-,*,/) :");
        String sy = sc.next();

        if(sy.equals("+")){
            int sum = num1+num2;
            System.out.println("Addition is "+sum);
        } else if (sy.equals("-")) {
            int sub = num1-num2;
            System.out.println("Subtraction is "+sub);
        } else if (sy.equals("*")) {
            int mul = num1 * num2;
            System.out.println("Multification is " + mul);
        }
        else if (sy.equals("/")) {
            double div = num1 / num2;
            System.out.println("Divison is " + div);
        }else {
            System.out.println("Please Enter Currect Symbol");
        }

    }
}
