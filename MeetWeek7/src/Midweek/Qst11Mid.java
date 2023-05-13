package Midweek;

import java.util.Scanner;

public class Qst11Mid {
    // 11. Write a program to print a string entered by user.

    public static void main(String[] args) {
        str();
    }
    public static void str(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :");
        String a = sc.next();

        System.out.println("The enter string is "+a);
    }
}
