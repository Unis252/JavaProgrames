package Arrays;

import java.sql.SQLOutput;
import java.util.logging.SocketHandler;

public class VerifyArrayIsSortedOrNot {

    public static void main(String[] args) {

        int[]a={1,2,3,5,6,7};

        boolean isSorted=true;

        for(int i=1;i<a.length;i++)
        {
            if(a[i]<a[i-1])
            {
                isSorted=false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }


    }

}
