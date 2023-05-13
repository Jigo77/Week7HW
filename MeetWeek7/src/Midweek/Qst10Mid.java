package Midweek;

import java.util.Scanner;

public class Qst10Mid {
    //10. Write a program to print the sum of two numbers entered by user by defining your
    //own method.

    public static void main(String[] args) {
        add();
    }

    public static void add(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number :");
        int n = sc.nextInt();

        System.out.println("Enter Second Number :");
        int m = sc.nextInt();

        int a= m+n;
        System.out.println("The sum of two number is "+a);
    }


}
