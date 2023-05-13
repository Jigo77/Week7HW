package Midweek;

public class Qst2Mid {
    //2. Print multiplication table of 24, 50 and 29 using loop.
    public static void main(String[] args) {
        num();

    }
    public static void num(){
        int a=24,b=50,c=29;
        for (int i=1;i<=10;i++){
            System.out.println(" "+a+" * "+i+" = "+(a*i));
        }
        System.out.println(" ");
        for (int j=1;j<=10;j++){

            System.out.println(" "+b+" * "+j+" = "+(b*j));
        }
        System.out.println(" ");
        for (int k=1;k<=10;k++){
            System.out.println(" "+c+" * "+k+" = "+(c*k));
        }
    }
}
