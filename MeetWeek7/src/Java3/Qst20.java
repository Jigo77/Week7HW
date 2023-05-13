package Java3;

import java.util.Arrays;

public class Qst20 {
    //20. Write a Java program to sort a numeric array and a string array.
    public static void main(String[] args) {
        add();
    }
    public static void add(){
        int a[]={1,4,2,6};
        String b[]={"Meet","Avani","Vidhi"};

        Arrays.sort(a);
        System.out.println(a);
        System.out.println(Arrays.stream(b).sorted());
    }
}
