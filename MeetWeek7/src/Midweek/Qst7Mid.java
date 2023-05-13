package Midweek;

import java.util.Scanner;

public class Qst7Mid {
    //7. Take input of age of 3 people by user and determine oldest and youngest among
    //them.

    public static void main(String[] args) {
        age();
    }
    public static void age(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter age of Meet :");
        int n = sc.nextInt();
        System.out.println("Enter age of Vidhi:");
        int m = sc.nextInt();
        System.out.println("Enter age of Situ:");
        int y = sc.nextInt();
        
        if (n > m && n > y){
            System.out.println("Meet is Oldest");
        } else if (m > n && m > y){
            System.out.println("Vidhi is Oldest");
        }else {
            System.out.println("Situ is Oldest");
        }

        if (n < m && n < y){
            System.out.println("Meet is Youngest");
        } else if (m < n && m < y){
            System.out.println("Vidhi is Youngest");
        }else {
            System.out.println("Situ is Youngest");
        }



            
        }
    }



