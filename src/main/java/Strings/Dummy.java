package Strings;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.HashMap;

public class Dummy {

    public static void main(String[] args) {

        String Str="MY Name is Younis";

        HashMap<Character,Integer> hashMap = new HashMap<>();

        for (int i=0;i<Str.length();i++)
        {
            char C=Str.charAt(i);
            if(hashMap.containsKey(C))
            {
                hashMap.put(C, hashMap.getOrDefault(C,0)+1);
            }
            else hashMap.put(C,1);
        }
        System.out.println(hashMap);


    }
}
