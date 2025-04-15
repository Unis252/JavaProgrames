package Arrays;

import java.util.HashSet;

public class IntersectionOfTwoArrays {

    public static void main(String[] args) {

        int[]a={1,2,3,4,5,6};
        int[]b={4,5,6,7,8,9};

        HashSet<Integer> set1 = new HashSet<Integer>();
        HashSet<Integer> set2 = new HashSet<Integer>();

        for(int i:a)
        {
            set1.add(i);
        }

        for(int i:b)
        {
            if(set1.contains(i)){
                set2.add(i);
            }

        }

        System.out.println(set2);

    }
}
