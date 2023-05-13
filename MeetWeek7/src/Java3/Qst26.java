package Java3;

public class Qst26 {
    //Write a Java program to reverse a word.

    public static void main(String[] args) {
        ad();
    }
    public static void ad(){
        String a = "Meet";
        String ab = a.trim();
        String res = "";
        char[] ch=ab.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            res += ch[i];
        }
        System.out.println("Reverse word: "+res.trim());
    }
    }

