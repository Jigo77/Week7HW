package Java3;

import java.util.Scanner;

public class Qst12 {
    public static void main(String[] args) {
        city();
    }
    public static void city(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Alphabet between A to F :");
        String n = sc.next();

        switch (n){
            case "A" :
                System.out.println("America");
                break;
            case "B" :
                System.out.println("Brazil");
                break;
            case "C" :
                System.out.println("Canada");
                break;
            case "D" :
                System.out.println("Denmark");
                break;
            case "E" :
                System.out.println("Europe");
                break;
            case "F" :
                System.out.println("France");
                break;
            default:
                System.out.println("Please Enter Alphabet between A to F");
                break;
        }
    }
}
