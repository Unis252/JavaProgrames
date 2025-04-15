package Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicatesFromArray {

    public static void main(String[] args) {

        int[]a={1,2,2,2,4,5,5,6,6,7,7,8,8,9};

        HashSet<Integer> hashSet = new HashSet<Integer>();

        for(int i=0;i<a.length;i++)
        {
            hashSet.add(a[i]);
        }
        System.out.println("Hashset contains" +hashSet);

        int index=0;

        int[] temp = new int[hashSet.size()];
        for(int i:hashSet)
        {
            temp[index++]=i;
        }
        System.out.println("Array after removing duplicates"+ Arrays.toString(temp));
    }
}
