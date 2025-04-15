package Strings;

import java.util.HashSet;

public class DuplicateElementsInStringArray {

    public static void main(String[] args) {

        String[] Words={"Amazon","Flipkart","Amazon","SnapDeal","Flipkart"};

        for(int i=0;i<Words.length;i++)
        {
            for(int j=i+1;j<Words.length;j++)
            {
                if(Words[i].equals(Words[j]))
                {
                    System.out.println("Duplicate Elements in Array is "+Words[i]);

                }
            }
        }

        HashSet<String> hashSet = new HashSet<>();
        for(int i=0;i<Words.length;i++)
        {
            if(!(hashSet.add(Words[i])))
            {
                System.out.println("Duplicates Elements in Array is " +Words[i]);
            }
        }

    }
}
