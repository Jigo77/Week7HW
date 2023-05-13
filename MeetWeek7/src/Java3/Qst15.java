package Java3;

import java.util.Scanner;

public class Qst15 {
    //15. Write a program that tells us input value is number or an alphabet or symbol.

    public static void main(String[] args) {
        nam();
    }
    public static void nam(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  number or an alphabet or symbol :");
        char sm = sc.next().charAt(0);
        String ab = "a",ac="z";
        if((sm >= 'a' && sm <= 'z')){
            System.out.println("Character");
        } else if (sm >='0' && sm <='9') {
            System.out.println("number");
        }else {
            System.out.println("Symbol");
        }

    }
}
