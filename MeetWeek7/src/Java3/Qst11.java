package Java3;

import java.util.Scanner;

public class Qst11 {
    //11. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) ifany
    //other alphabet should be invalid entry.

    public static void main(String[] args) {
        city();
    }
    public static void city(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Alphabet between A to F");
        char n = sc.next().charAt(0);
        if(n=='A'){
            System.out.println("America");
        //if(n.equals("A")){
           // System.out.println("America");
        }






        /*else if (n.equals("B")) {
            System.out.println("Brazil");
        } else if (n.equals("C")) {
            System.out.println("Canada");
        } else if (n.equals("D")) {
            System.out.println("Denmark");
        } else if (n.equals("E")) {
            System.out.println("Egept");
        }else if (n.equals("F")) {
            System.out.println("France");
        }*/
        else
        {
            System.out.println("Please Enter between A to F");
        }
    }
}
