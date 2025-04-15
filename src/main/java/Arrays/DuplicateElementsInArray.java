package Arrays;

import java.util.HashSet;

public class DuplicateElementsInArray {
    public static void main(String[] args) {

        int[]a={1,2,3,4,4,5,6,7,7,8,8,8};

        HashSet<Integer> hashSet = new HashSet<Integer>();

        for(int i=0;i<a.length;i++)
        {
            if (!hashSet.add(a[i]))
            {
                System.out.print(a[i]+" ");
            }
        }

    }
}
