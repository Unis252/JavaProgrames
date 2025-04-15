package Strings;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharactersInString {

    public static void main(String[] args) {

        String S1="MY Name is Younis";

        Map<Character,Integer> hashMap = new HashMap<>();

        for(char c:S1.toCharArray())
        {
            if(hashMap.containsKey(c))
            {
                hashMap.put(c, hashMap.getOrDefault(c,0)+1);
            }
            else
            {
                hashMap.put(c,1);
            }

        }

        System.out.println(hashMap);




    }


}
