package Midweek;

import java.util.Scanner;

public class Qst5Mid {
    //5. Take two int values from user and print greatest among them.

    public static void main(String[] args) {
        val();
    }
    public static void val(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 Number :");
        int s = sc.nextInt();

        System.out.println("Enter 2 Number :");
        int d = sc.nextInt();

        if(s>d){
            System.out.println(s+" is greatest then "+d);
        }else {
            System.out.println(d+" is greatest then "+s);
        }
    }
}
