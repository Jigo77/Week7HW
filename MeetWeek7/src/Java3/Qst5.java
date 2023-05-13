package Java3;

import java.util.Scanner;

public class Qst5 {
    //5. Write a java program to input student Name, roll No, and three subjects Math, Science and English
    //marks (marks is between 0 to 100 and if it is out of range print error message “InvalidInput, Marks
    //should between 0 to 100”) and find out total, percentage and result.
    //If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
    //%> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
    static int maths,sci,eng,total;
    static double per;
    static String res,grade;

    public static void main(String[] args) {
        result();
    }

    public static void result() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Name :");
        String name = sc.next();

        System.out.println("Enter Roll Number");
        int roll = sc.nextInt();

        System.out.println("Enter Maths Subject Marks :");
        maths = sc.nextInt();

        if (maths >= 0 && maths <= 100) {

            System.out.println("Enter Science Subject Marks :");
             sci = sc.nextInt();

            System.out.println("Enter English Subject Marks :");
             eng = sc.nextInt();
        }

        else {
            System.out.println("Please enter Marks between 0 and 100");
        }

         total = maths+sci+eng;

        per = total / 3;

        if(per >= 35){
            res = "Pass";

            if(per >= 80){
                grade = "A+";
            } else if (per >= 60 && per <80) {
                grade = "A";
            } else if (per >= 50 && per <60) {
                grade = "B";
            }else if (per >=35 && per <50){
                grade = "C";
            }
        }
        else {
            res = "Fail";
            grade = "-";
        }

        System.out.println("|----------------------------------------|");
        System.out.println("|             Mark Sheet                 |");
        System.out.println("|________________________________________|");
        System.out.println("|      Name         : "+name +"               |");
        System.out.println("|      Roll No      : "+roll +"                 |");
        System.out.println("|________________________________________|");
        System.out.println("|      Subject      :    Marks           |");
        System.out.println("|________________________________________|");
        System.out.println("|      Maths        :   "+maths +"               |");
        System.out.println("|      Science      :   "+sci +"               |");
        System.out.println("|      English      :   "+eng +"               |");
        System.out.println("|________________________________________|");
        System.out.println("|      Total        :   "+total +"              |");
        System.out.println("|________________________________________|");
        System.out.println("|      Percentage   :   "+per +"             |");
        System.out.println("|      Result       :   "+res +"             |");
        System.out.println("|      Grade        :   "+grade +"                |");
        System.out.println("|________________________________________|");



    }
}

