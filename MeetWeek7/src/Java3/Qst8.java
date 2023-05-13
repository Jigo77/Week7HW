package Java3;

import java.util.Scanner;

public class Qst8 {
    //8. Write a java program to get numbers from users and print whether it is positive or negative.
    public static void main(String[] args) {
        num();
    }
    public static void num(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int number = sc.nextInt();

        if(number > 0){
            System.out.println("The given number is Positive");
        } else if (number < 0) {
            System.out.println("The given number is Nagative");
        }else {
            System.out.println("The given number is Zero");
        }
    }
}
