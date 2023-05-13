package Midweek;

import java.util.Scanner;

public class Qst4Mid {
    //4. Take values of length and breadth of a rectangle from user and check if it is square or not.
    public static void main(String[] args) {
        add();
    }

    public static void add(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length :");
        double n = sc.nextInt();

        System.out.println("Enter Breadth :");
        double m = sc.nextInt();

        if(n == m){
            System.out.println("It is Square");
        }else {
            System.out.println("it`s not Squre");
        }

    }


}
