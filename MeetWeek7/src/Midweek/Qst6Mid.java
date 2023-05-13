package Midweek;

import java.util.Scanner;

public class Qst6Mid {
    //6. A school has following rules for grading system:
    //a. Below 25 - F
    //b. 25 to 45 - E
    //c. 45 to 50 - D
    //d. 50 to 60 - C
    //e. 60 to 80 - B
    //f. Above 80 - A
    //Ask user to enter marks and print the corresponding grade.
    public static void main(String[] args) {
        gra();
    }
    public static void gra(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Subject Marks");
        int ma = sc.nextInt();

        if(ma >= 80 && ma <=100){
            System.out.println("A");
        } else if (ma >=60 && ma <=79) {
            System.out.println("B");
        }else if (ma >=50 && ma <=59){
            System.out.println("C");
        }else if (ma >=45 && ma <=49){
            System.out.println("D");
        }else if (ma >=25 && ma <=44){
            System.out.println("E");
        }else if (ma >=0 && ma <=24){
            System.out.println("F");
        }else {
            System.out.println("Invalid Marks");
        }
    }
}
