package Strings;

public class ReverseEachWordInAString {

    public static void main(String[] args) {

        String S1="My Name Is Younis";

        String[]S2=S1.split(" ");

        String ReveredString="";

        for(String S3:S2)
        {
            String reverseword="";
            for(int i=S3.length()-1;i>=0;i--)
            {
                reverseword=reverseword+S3.charAt(i);
            }
            ReveredString=ReveredString+reverseword+"   ";
        }
        System.out.println(ReveredString);
    }
}
