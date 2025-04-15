package Numbers;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {

        System.out.println("Enter any number");
        Scanner sc = new Scanner(System.in);
        int number=sc.nextInt();
        int originalnumber=number;
        int rev=0;
        while(number!=0)
        {
            int digit = number % 10;       // Get the last digit
            rev = rev * 10 + digit;        // Build the reversed number
            number = number / 10;          // Remove the last digit
        }

        if(rev==originalnumber)
        {
            System.out.println("Given number is Palindrome");
        }
        else System.out.println("Not a Palindrome");
        sc.close();
    }
}
