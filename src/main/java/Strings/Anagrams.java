package Strings;
import java.util.Arrays;

public class Anagrams {

    public static void main(String[] args) {

        String S1="silent", S2="listen";

        char[] ch1=S1.toCharArray();
        char[] ch2=S2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if(Arrays.equals(ch1,ch2))
        {
            System.out.println("Both strings are anagrams");
        }
        else System.out.println("Both are not anagrams");
    }
}
