package Java3;

public class Qst14 {
    //14. Write a java program to print the numbers between 1 to 100 which can be divided by 3and
    //5 separately.

    public static void main(String[] args) {
        num();
    }
    public static void num(){
        System.out.println("List of divided by 5");
        for(int i=1;i<=100;i++){
            if(i % 5 == 0){
                System.out.println(i);
            }


        }
        System.out.println("List of divided by 3");
        for (int j=1;j<=100;j++){
            if(j % 3 == 0){
                System.out.println(j);
            }
        }
    }
}
