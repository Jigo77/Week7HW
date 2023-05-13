package Java3;

import java.util.Scanner;

public class Qst4 {
    //4. Write if else condition and print your group name in console else others group name.

    public static void main(String[] args) {
        group();
    }

    public static void group(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name in lowercase :");
        String name = sc.next();
        String a = "meet",b="vidhi",c="situ";

        if(a.equals(name) || b.equals(name) || c.equals(name)){
            System.out.println(name +" is in Selenium Group");
       }

        else {
            System.out.println(name +" is in other Group");
        }
        /*System.out.println(a);
        System.out.println(name);
        if(a.equals(name)){
            System.out.println("correct");
        }*/
    }


}
