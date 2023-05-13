package Java3;

import java.util.Scanner;

public class Qst1 {

    //1. Write a java program that tells us that Input number is odd or even? HINT: use ternary
    //operator (? :)
    public static void main(String[] args) {
        odd();
    }

    public static void odd(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("The given number is Even");
        }
        else {
            System.out.println("The given number is odd");
        }

    }

}
