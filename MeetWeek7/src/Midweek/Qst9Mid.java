package Midweek;

import java.util.Scanner;

public class Qst9Mid {
    //9. Modify the above question to allow student to sit if he/she has medical cause. Ask
    //user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.

    public static void main(String[] args) {
        mad();
    }
    public static void mad(){
        Scanner sc = new Scanner(System.in);

        System.out.println("He/She has a Medical Cause (Y/N) :");
        String n = sc.next();

        if(n.equals("Y")){
            System.out.println("Have a medical cause");
        } else if (n.equals("N")) {
            System.out.println("Not have a medical cause");
        }else {
            System.out.println("Please enter Y/N ");
        }
    }
}
