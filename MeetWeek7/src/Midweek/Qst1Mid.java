package Midweek;

import java.util.Scanner;

public class Qst1Mid {

    public static void main(String[] args) {
        add();
    }
    public static void add(){
        int sum=0,ave;
        Scanner sc = new Scanner(System.in);
        for (int i =0;i<10;i++){
            System.out.println("Enter Number :");
            int n = sc.nextInt();
            sum=sum+n;

        }
        System.out.println("The Average is : "+(sum/10));
    }
}
