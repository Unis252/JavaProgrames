package Arrays;

import java.util.Arrays;

public class MoveAllRepeatingNumbersToEnd {

    public static void main(String[] args) {

        int[]a={1,7,3,7,2,7,7,8};

        int[]temp=new int[a.length];
        int TempIndex=0;

        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=7)
            {
                temp[TempIndex]=a[i];
                TempIndex++;
            }
        }

        while(TempIndex < a.length)
        {
            temp[TempIndex]=7;
            TempIndex++;
        }
        System.out.println("Array after moving all repeating numbers is "+ Arrays.toString(temp));
    }
}
