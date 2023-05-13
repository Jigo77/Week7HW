package Java3;

public class Qst2 {
    //2. Declare array and store any 5 countries and print them in console.

    static String country[] = {"INDIA","UK","USA","CANADA","FRANCE"};

    public static void main(String[] args) {
        coun();

    }
    public static void coun(){
        for(int i=0;i<5;i++){
            System.out.println("Country Name is :" +country[i]);
        }

    }


}
