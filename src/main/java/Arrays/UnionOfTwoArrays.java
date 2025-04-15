package Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class UnionOfTwoArrays {

    public static void main(String[] args) {

        int[]a={1,2,3,4,5,6};
        int[]b={4,5,6,7,8,9};

        HashSet<Integer> hashSet = new HashSet<>();

        for(int i:a)
        {
            hashSet.add(i);
        }
        for (int i:b)
        {
            hashSet.add(i);
        }

        System.out.println("Union of Two Arrays is "+ hashSet);
    }
}
