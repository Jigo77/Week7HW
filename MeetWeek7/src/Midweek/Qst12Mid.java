package Midweek;

import java.util.Scanner;

public class Qst12Mid {
    //12. Write a program to find the length of the string "refrigerator".

    public static void main(String[] args) {
        strt();
    }
    public static void strt(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :");
        String a = sc.next();

        int ab = a.length();
        System.out.println(ab);
    }
}
