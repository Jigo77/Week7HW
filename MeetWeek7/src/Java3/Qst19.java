package Java3;

import java.util.Scanner;

public class Qst19 {
    //19. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or“ZERO”.

    public static void main(String[] args) {
        po();
    }
    public static void po(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int a = sc.nextInt();

        if(a>0){
            System.out.println("The number is Positive");
        } else if (a<0) {
            System.out.println("The number is Negative");

        }else {
            System.out.println("The number is Zero");
        }
    }
}
