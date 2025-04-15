package Strings;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfWordsInString {

    public static void main(String[] args) {

        String[] Words={"Amazon","Flipkart","Amazon","SnapDeal","Flipkart"};

        HashMap<String,Integer> hashMap = new HashMap<>();

        for(String Word:Words)
        {
            if(hashMap.containsKey(Word))
            {
                hashMap.put(Word, hashMap.getOrDefault(Word,0)+1);
            }
            else
            {
                hashMap.put(Word,1);
            }
        }
        System.out.println(hashMap);

        for(Map.Entry<String,Integer> entry:hashMap.entrySet())
                {
                    System.out.println(entry.getKey() +":"+entry.getValue());
                }
    }
}
