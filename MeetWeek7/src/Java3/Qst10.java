package Java3;

import java.util.Scanner;

public class Qst10 {
    //10. Write a java program input sales id, seller's name, sales amount, and salary basic and then
    //fined this sales
    //Commission
    //Sales amount >= 50,000 35%
    //Sales amount >= 30,000 20%
    //>= 20,000 10%
    //>= 10,000 5%
    //< 10,000 2%

    public static void main(String[] args) {
        nam();
    }
    public static void nam(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Saler id :");
        String a = sc.next();
        System.out.print("Enter seller`s name :");
        String b = sc.next();
        System.out.println("Enter Sales Amount :");
        int c = sc.nextInt();
        System.out.println("Enter Salary :");
        double d = sc.nextInt();

        if(c >= 50000){
            System.out.println("The commition is :"+c*0.35);
        }else if(c >= 30000 && c < 50000){
            System.out.println("The commition is :"+c*0.20);
        }else if(c >= 20000 && c < 30000){
            System.out.println("The commition is :"+c*0.10);
        }else if(c > 10000 && c < 20000){
            System.out.println("The commition is :"+c*0.05);
        }else if(c > 10000 && c < 20000){
            System.out.println("The commition is :"+c*0.02);
        }else {
            System.out.println("Please enter above 0");
        }
    }
}
