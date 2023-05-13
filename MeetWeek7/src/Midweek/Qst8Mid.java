package Midweek;

import java.util.Scanner;

public class Qst8Mid {
    //8. A student will not be allowed to sit in exam if his/her attendence is less than 75%.
    //Take following input from user
    //Number of classes held
    //Number of classes attended.
    //And print
    //percentage of class attended
    //Is student is allowed to sit in exam or not.

    public static void main(String[] args) {
        att();
    }
    public static void att(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of classes held :");
        int n = sc.nextInt();

        System.out.println("Enter Number of classes attended :");
        int m = sc.nextInt();

        double a= 100*m/n;
        System.out.println("The percentage of attendace is :"+a+"%");

        if(a>=35){
            System.out.println("You are allow to sit in exam.");
        }else {
            System.out.println("Not allow to sit in exam.");
        }

    }
}
