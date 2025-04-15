package Strings;

import java.util.Scanner;

public class ReverseOfAString {

    public static void main(String[] args) {

        System.out.println("Enter any string");
        Scanner scanner = new Scanner(System.in);
        String GivenString=scanner.nextLine();
        String S2="";

        for(int i=GivenString.length()-1;i>=0;i--)
        {
            S2=S2 + GivenString.charAt(i);
        }
        System.out.println("Reversed String is "+S2);
    }
}
