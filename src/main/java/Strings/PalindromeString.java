package Strings;

import java.util.Scanner;

public class PalindromeString {

    public static void main(String[] args) {

        System.out.println("Enter any string");
        Scanner sc = new Scanner(System.in);
        String S1=sc.next();
        String Rev="";

        for(int i=S1.length()-1;i>=0;i--)
        {
            Rev=Rev+S1.charAt(i);
        }

        System.out.println(Rev);
        if(Rev.equals(S1))
        {
            System.out.println("given string is Palindrome");
        }
        else System.out.println("Not a Palindrome");


    }
}
