package Arrays;

import java.security.Key;
import java.util.HashMap;

public class FrequencyOfElementsInArray {

    public static void main(String[] args) {

        int[]a={1,2,2,2,3,3,3,3,3,5,6,7,7,9};

        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for(int i:a)
        {
            /*hashMap.put(i,hashMap.getOrDefault(i,0)+1);*/
            if(hashMap.containsKey(i))
            {
                hashMap.put(i, hashMap.get(i)+1);
            }
            else
            {
                hashMap.put(i,1);
            }
        }
        System.out.println(hashMap);
    }
}
